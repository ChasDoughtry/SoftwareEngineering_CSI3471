/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration3;

public class Person {
    String name;
    int idNumber;
    private static int population = 0;

    Person(){
        if(getClass() == Person.class) {
            Person.population++;
        }
    }
    Person(String name, int idNumber){
        this();
        this.name = name;
        this.idNumber = idNumber;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(int id){
        idNumber = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String word){
        name = word;
    }
    public static int getPopulation(){
        return population;
    }
    public boolean equals(Object object){
        if (object instanceof Person &&
                ((Person)object).getIdNumber() == this.getIdNumber() &&
        ((Person)object).getName().hashCode() == this.getName().hashCode()){
            return true;
        } else {
            return false;
        }
    }
}
