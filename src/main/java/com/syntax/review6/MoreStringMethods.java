package com.syntax.review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String day="Thursday";
        char character=day.charAt(2);
        System.out.println(character);

        int anotherIndex=day.indexOf("day");
        System.out.println(anotherIndex);

        int index=day.indexOf('s');
        System.out.println(index);

        System.out.println("-----SPLIT-----");

        String food="I like indian food";
        String [] words= food.split(" ");
        for (String word:words){
            System.out.println(word);
        }


    }
}
