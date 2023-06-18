package com.syntax.review11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        ArrayList <String> arrayList=new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        arrayList.add("Semir");

        System.out.println(arrayList);

       // arrayList.removeIf(x->x.length()>5);

      //  arrayList.removeIf(x->x.length()%2!=0);

        arrayList.removeIf(x->x.length()>5 || x.contains("a"));
        System.out.println(arrayList);





    }
}
