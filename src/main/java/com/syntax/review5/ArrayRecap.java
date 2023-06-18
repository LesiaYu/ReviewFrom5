package com.syntax.review5;

public class ArrayRecap {
    public static void main(String[] args) {

        String[] languages={"English","Russian","Turkish","Ukrainian","Spanish"};

        for (String language:languages){
            System.out.println(language+" ");
        }

        System.out.println("-----REVERSE--------");

        for (int i = languages.length-1; i >=0 ; i--) {
            System.out.println(languages[i]);

        }
    }

}
