  package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

  public class E6Maps {
    public static void main(String[] args) {

        Map<String, Integer> map=new HashMap<>();
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange", 4);
        map.put("Mango", 3);
        map.put("Banana", 30);

        Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
        //var entrySet=map.entrySet();
        for(Map.Entry<String, Integer> entry:entrySet){
            if(entry.getKey().contains("a") && entry.getValue()>4){
                System.out.println(entry);
            }
        }

        //for(var entry:entrySet){
        //     System.out.println(entry);
        // }


    }
}
