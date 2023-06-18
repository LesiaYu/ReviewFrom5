package com.syntax.review5;

public class Task6 {

    public static void main(String[] args) {

        // prime number - >1; should be divisible by itself only
        // 3(by 2), 4 (2,3), 5(2,3,4), ///

        int num=7;
        boolean isPrime=true;

        if (num>1){

            for(int i=2; i<num; i++){

                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else{
            isPrime=false;
        }


        if (isPrime) {
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is a not prime number");
        }





    }
}
