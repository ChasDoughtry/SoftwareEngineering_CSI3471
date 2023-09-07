/*
Chas Doughtry
CSI3471 01
Prof Quevedo
September 6, 2023
 */
package edu.baylor.ecs.csi3471.lab3.iteration1;

public class Person {
    String name;
    int idNumber;

    Person(){
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
}
