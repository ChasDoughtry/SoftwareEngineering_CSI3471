package edu.baylor.ecs.csi3471.DoughtryChas.module1;

public class StringExercise2 {
    String[] Splitter(String word){

        if(word.charAt(0) =='"' && word.charAt(word.length() - 1) == '"'){
            word = word.substring(1,(word.length()-1));
        }

        return word.split(",");
    }

    public static void main (String[] args){
        StringExercise2 s = new StringExercise2();

        String[] arrWords;

        for(int i = 0; i < args.length; i++){
            arrWords = s.Splitter(args[i]);
            for(int j = i; j < arrWords.length; j++) {
                System.out.println(arrWords[j]);
            }
        }

    }

}
