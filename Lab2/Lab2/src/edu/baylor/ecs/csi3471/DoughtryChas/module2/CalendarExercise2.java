package edu.baylor.ecs.csi3471.DoughtryChas.module2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class CalendarExercise2 {
    public static String processDate(String sDate) throws Exception{

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date1 = dateFormat.parse(sDate);

        date1.setHours(date1.getHours() + 2);
        date1.setMinutes(date1.getMinutes() + 2);

        sDate = dateFormat.format(date1);

        return sDate;
    }
    static void testProcessDateCurrentDay(){
        String testDate = "2020-08-01 09:45:37";

        System.out.println("Testing processDate within the same day:");
        System.out.println("Before: " + testDate);
        System.out.println("Expected result: 2020-08-01 11:47:37");

        try {
            testDate = processDate(testDate);
        }catch (Exception e){
            System.err.println("ParseException");
        }

        System.out.println("Output: " + testDate);
    }
    static void testProcessDateNextDay(){
        String testDate = "2020-08-01 23:15:21";

        System.out.println("Testing processDate rolling to next day:");
        System.out.println("Before: " + testDate);
        System.out.println("Expected result: 2020-08-02 01:17:21");

        try {
            testDate = processDate(testDate);
        }catch (Exception e){
            System.err.println("ParseException");
        }

        System.out.println("Output: " + testDate);
    }

    public static void main(String[] args){

        // Tests processDate within the same day
        testProcessDateCurrentDay();
        System.out.print('\n');
        // Tests processDate rolling to the next day
        testProcessDateNextDay();
    }
}
