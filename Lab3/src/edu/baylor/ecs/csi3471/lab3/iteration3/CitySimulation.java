/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration3;

public class CitySimulation {
    public static void main(String[] args) {

        Student s1 = new Student("Bob", 1, 3.2);
        Student s2 = new Student("Bob", 1, 3.2);

        System.out.println("Using \"==\"");
        if (s1 == s2){
            System.out.println("s1 == s2");
        } else{
            System.out.println("s1 != s2");
        }
        System.out.println("\nUsing \".equals\"");
        if (s1.equals(s2)){
            System.out.println("s1 equals s2");
        } else{
            System.out.println("s1 does not equal s2");
        }
    }
}
