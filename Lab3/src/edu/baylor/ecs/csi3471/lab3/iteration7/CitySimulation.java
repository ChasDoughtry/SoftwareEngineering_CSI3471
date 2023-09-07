/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration7;
public class CitySimulation {
    /*
    The dispatch method prints "I am a student" if
    a student object is passed as an argument.
    The student accept method will override
    the person accept method.
     */
    public static void dispatch(Person p){
        //p.printMe();
        //identify(p);
        p.accept(new CitySimulation());
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
