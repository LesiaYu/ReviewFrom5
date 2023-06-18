package com.syntax.review10;

public class FaceBookUserTest {
    public static void main(String[] args) {

        FacebookUser vlad=new FacebookUser("Vlad","user123",
                "pass123", "1950-1-1");
        System.out.println(vlad.getDob());
        System.out.println(vlad.getUserName());
        vlad.setUserName("Tswift123");
        System.out.println(vlad.getUserName());

    }
}
