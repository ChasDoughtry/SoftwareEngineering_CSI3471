/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration7;


public class Student extends Person {
    double GPA;
    private static int population = 0;
    Student(){
        super();
        Student.population++;
    }
    Student(String name, int idNumber, double GPA){
        super(name, idNumber);
        Student.population++;
        this.GPA = GPA;
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
    public boolean equals(Object object){
        if (super.equals(object) &&
                object instanceof Student &&
                ((Student)object).getGPA() == this.getGPA()){
            return true;
        } else {
            return false;
        }
    }

    public void printMe(){
        System.out.println("I am a student.");
    }
    public void accept(CitySimulation c){
        CitySimulation.identify(this);
    }
}
