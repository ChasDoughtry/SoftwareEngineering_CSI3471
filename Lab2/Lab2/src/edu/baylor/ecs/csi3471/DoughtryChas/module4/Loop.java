package edu.baylor.ecs.csi3471.DoughtryChas.module4;

public class Loop {
    static void Loop(int x){
        if(x == 0){
            System.out.println(x + " loops left");
        }
        else if (x > 0){
            System.out.println(x + " loops left");
            Loop(x-1);
        }
    }

    public static void main(String[] args){
        Loop(10);
    }
}
