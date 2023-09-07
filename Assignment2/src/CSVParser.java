/* CSI 3471
 * Filename: CSVParser.java
 * Student name: Chas Doughtry
 * Assignment: 2 - parsing a CSV file
 * Due Date: Sep 3, 2023
 * OS: Windows
 * This program parses a CSV file that follows the column
 * format "Name, Activity,Lifted Weight,Your Weight,Duration (min),
 * Start,End,Consumption(magnesium/vitamin C/calcium)"
 *
 * Input the file using file redirection.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class CSVParser {

    /* removeApostrophe
     * parameters: word - string to be checked
     * return: void
     * Checks if a string includes apostrophes and
     * removes them if necessary.
     */
    public static void removeApostrophe(String word){
        if(word.charAt(0) =='"' && word.charAt(word.length() - 1) == '"'){
            word = word.substring(1,(word.length()-1));
        }
    }

    /* findDuration
     * parameters: startDate - Session start time
     *             endDate   - Session end time
     * return: Total session length
     * Parses strings for dates and calculates the difference.
     */
    public static double findDuration(String startDate, String endDate) throws Exception{
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");
        Date date1 = dateFormat.parse(startDate);
        Date date2 = dateFormat.parse(endDate);

        return date2.getTime()-date1.getTime();
    }

    /* findVitC
     * parameters: line - Consumption column from csv file
     * return: Vitamin C consumption
     * Splits consumption line and returns double representation
     * of Vitamin C consumption.
     */
    public static double findVitC(String line){
        String[] wordArr = line.split("/");
        return Double.parseDouble(wordArr[1]);
    }

    /* main
     * return: void
     * Parses CSV file for user data and prints
     * results.
     */
    public static void main(String[] args) {

        double totalWeight = 0, maxWeight = 0, maxVitC = 0, temp = 0,
               maxSession = 0;
        int totalPeople = 0;
        String[] lineArr;
        String maxWeightPerson = "", maxVitCPerson = "",
            maxSessionPerson = "";
        Scanner scanner = new Scanner(System.in);

        //skip title row
        scanner.nextLine();

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            lineArr = line.split(",");

            if(lineArr.length == 8 &&
                    !(Arrays.asList(lineArr).contains(""))) { //check if columns are accurate

                //Longest Workout
                removeApostrophe(lineArr[5]); // startDate
                removeApostrophe(lineArr[6]); // endDate
                try {
                    temp = findDuration(lineArr[5], lineArr[6]);
                } catch (Exception e) {
                    System.err.println("ParseException");
                }
                if (temp > maxSession) {
                    maxSession = temp;
                    maxSessionPerson = lineArr[0];
                }

                //Vitamin C consumption
                removeApostrophe(lineArr[7]); // consumption column
                temp = findVitC(lineArr[7]);
                if (temp > maxVitC) {
                    maxVitC = temp;
                    removeApostrophe(lineArr[0]);
                    maxVitCPerson = lineArr[0];
                }

                // Heaviest Person
                removeApostrophe(lineArr[3]); // user weight column
                if (Double.parseDouble(lineArr[3]) > maxWeight) {
                    maxWeight = Double.parseDouble(lineArr[3]);
                    removeApostrophe(lineArr[0]);
                    maxWeightPerson = lineArr[0];

                }

                // total Weight
                totalWeight += Double.parseDouble(lineArr[3]);
                totalPeople++;

            }
        }

        System.out.println("Longest Workout Session: " + maxSessionPerson);
        System.out.println("Heaviest Person: " + maxWeightPerson + " - " + maxWeight);
        System.out.println("Highest Vitamin C Consumption: " + maxVitCPerson + " - " + maxVitC);
        System.out.println("Total People: " + totalPeople);
        System.out.println("Average Weight: " + (totalWeight/totalPeople));

        scanner.close();

    }
}
