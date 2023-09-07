/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration2;

public class CitySimulation {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++){
            if((int)(Math.random() * (10) + 1) % 2 == 0){
                new Person();
            } else {
                new Student();
            }
        }
        System.out.println("City Simulation:");
        System.out.println("Number of People: " + Person.getPopulation());
        System.out.println("Number of Students: " + Student.getPopulation());
    }
}
