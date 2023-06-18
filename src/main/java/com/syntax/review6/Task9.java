package com.syntax.review6;

public class Task9 {
    public static void main(String[] args) {

        int [] numbers={100,100, 65,87,23,46,98,11,88,67};

        int largest=numbers[0];
        int secondLargest=0;

        for (int i=0; i< numbers.length; i++){
            if (numbers[i]>largest){
                secondLargest=largest;
                largest=numbers[i];
            } else if (numbers[i]>secondLargest && numbers[i]!=largest) {
                secondLargest=numbers[i];

            }
        }
        System.out.print("the second largest number is "+secondLargest);


    }
}
