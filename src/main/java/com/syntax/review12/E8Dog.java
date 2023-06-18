package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class E8Dog {
    public static void main(String[] args) {

        Dog dog1=new Dog("Jodi", 10);
        Dog dog2=new Dog("Jimmi", 11);
        Dog dog3=new Dog("Luci", 15);

        Map<String, Dog> dogMap=new HashMap<>();
        dogMap.put("Jodi", dog1);
        dogMap.put("Jimmi", dog2);
        dogMap.put("Luci", dog3);
        System.out.println(dogMap);
        dogMap.forEach((k,v)->v.printInfo());
    }
}
