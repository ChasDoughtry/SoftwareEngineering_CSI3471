package edu.baylor.ecs.csi3471.DoughtryChas.module1;

public class StringExercise3 {
    String httpRemover(String word){
        word = word.replaceAll("(?i)HTTPS","");
        word = word.replaceAll("(?i)HTTP","");
        return word;
    }

    public static void main(String[] args){
        StringExercise3 s = new StringExercise3();

        for(int i = 0; i < args.length; i++){
            System.out.println(s.httpRemover(args[i]));
        }
    }
}
