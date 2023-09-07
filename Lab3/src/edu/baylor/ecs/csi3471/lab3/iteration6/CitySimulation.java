/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration6;
public class CitySimulation {
    /*
    The dispatch method does not print
    "I am a student" or "this is a student."
    The identify(Student s) method cannot
    be accessed because static methods
    cannot be overridden.
     */
    public static void dispatch(Person p){
        //p.printMe();
        identify(p);
    }
    public static void identify(Person p){
        System.out.println("this is a person");
    }
    public static void identify(Student s){
        System.out.println("this is a student");
    }

    public static void main(String[] args) {
        Person p;

        for(int i = 0; i < 100; i++){
            if((int)(Math.random() * (10) + 1) % 2 == 0){
                p = new Person();
                dispatch(p);
            } else {
                p = new Student();
                dispatch(p);
            }
        }
        System.out.println("\nCity Simulation:");
        System.out.println("Number of People: " + Person.getPopulation());
        System.out.println("Number of Students: " + Student.getPopulation());
    }
}
