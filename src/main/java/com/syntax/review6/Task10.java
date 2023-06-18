package com.syntax.review6;

public class Task10 {
    public static void main(String[] args) {

        String [] elements={"Table", "Rocki", "Name", "Age", "Xerox", "BMV", "Name"};


        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {

                if (elements[i].equals(elements[j])  ){
                    System.out.println("Duplicate elements is "+ elements[j]);
                }
            }

        }


    }
}
