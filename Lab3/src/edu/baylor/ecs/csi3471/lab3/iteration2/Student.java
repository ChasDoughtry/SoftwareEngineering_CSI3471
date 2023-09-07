/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration2;


public class Student extends Person {
    double GPA;
    private static int population = 0;
    Student(){
        Student.population++;
    }
    public double getGPA(){
        return GPA;
    }
    public void setGPA(int num) {
        GPA = num;
    }
    public static int getPopulation(){
        return Student.population;
    }
}
