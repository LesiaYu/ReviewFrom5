package com.syntax.review5;

public class TwoDArray {
    public static void main(String[] args) {

        String [][] cars={
                {"Ford","Lincoln","Dodge"},
                {"BMW","Audi","Mercedes","VW","Fiat"},
                {"Honda","Toyota","Subary","Nissan"}
        };
        System.out.println(cars[1][1]);

             for (String [] garage:cars){

                 for(String car:garage){
                     System.out.print(car+" ");

                 }
            }

        }


            }

