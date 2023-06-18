package com.syntax.review6;

public class Task8 {
    public static void main(String[] args) {

        int [] number= {10,100,20,40,10,-8,7999};

        int max=number[0];
        int min=number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i]<min){
                    min=number[i];
                }
                else if (number[i]>max){
                    max=number[i];
                }
            }
        System.out.print("The maximum number is "+max);
        System.out.println();
        System.out.print("The minimum number is "+min);

    }
}
