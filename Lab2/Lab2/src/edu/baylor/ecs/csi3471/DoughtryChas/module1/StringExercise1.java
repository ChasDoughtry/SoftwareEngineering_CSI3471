package edu.baylor.ecs.csi3471.DoughtryChas.module1;

public class StringExercise1 {
     String crazyCase (String word){
         char[] charWord = word.toCharArray();

        if(word.charAt(0) != 'i' && word.charAt(0) != 'I'){
            for(int i = 0; i < charWord.length; i += 2){
                if(charWord[i] >= 'a'){
                    charWord[i] = Character.toUpperCase(charWord[i]);
                }
            }
        }
        return String.valueOf(charWord);
    }
    public static void main (String[] args){
         StringExercise1 s = new StringExercise1();

        for (int i = 0; i < args.length; i++){
            System.out.println(s.crazyCase(args[i]));
        }
    }
}