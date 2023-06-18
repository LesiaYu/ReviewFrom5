package com.syntax.review11;

public class E1ArrayList {
    public static void main(String[] args) {

        String [] names=new String[3];
        names[0]="Leonardo";
        names[1]="Wael";
        names[2]="Axel";

        for(String name:names){
            if(name.equals("Axel")){
                System.out.println("Found");
            }
        }


    }
}
