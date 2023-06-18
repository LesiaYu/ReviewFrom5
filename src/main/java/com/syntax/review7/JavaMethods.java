package com.syntax.review7;

public class JavaMethods {

        void hello(){
            System.out.println("Hello");
        }

        void helloName(String name){
            System.out.println("Hello "+name);
        }

        // I want method that accepts 3 String, concatenates them and return a new Concatenated String

    String concatenate(String str1, String str2, String str3){
        return str1.concat(str2).concat(str3);
    }

      //I want to create a method that will return me the largest numbers from given 2 numbers

    int largest(int num1, int num2){
            int large;
           if (num1>num2){
               large=num1;
           } else{
               large=num2;
           }return large;
        }
        // I want to create a method that will convert Celsius to Farengait and return that value

    double convertTemp (double Celsius){

            double Faren=Celsius*1.8+32;
            return Faren;
    }
    //create a method that will return an Array of words from given Sentence

    String [] words(String sentence){
            String [] words=sentence.split(" ");
                return words;
            }






}
