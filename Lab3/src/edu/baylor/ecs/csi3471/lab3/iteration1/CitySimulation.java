/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration1;

public class CitySimulation {
    public static void main(String[] args) {
        int personCount = 0, studentCount = 0;

        for(int i = 0; i < 100; i++){
            if((int)(Math.random() * (9) + 1) % 2 == 0){
                new Person();
                personCount++;
            } else {
                new Student();
                studentCount++;
            }
        }
        System.out.println("City Simulation:");
        System.out.println("Number of People: " + personCount);
        System.out.println("Number of Students: "+ studentCount);
    }
}
