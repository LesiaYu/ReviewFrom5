package com.syntax.review10;

public class FacebookUser {

   private String name;
   private String userName;
   private String password;
   private String dob;

    FacebookUser(String name, String userName,String password,String dob){
        this.name=name;
        this.userName=userName;
        this.password=password;
        this.dob=dob;
    }

    void login(String userName, String password){
        if (this.userName.equals(userName)&&this.password.equals(password)){
            System.out.println("Logged in");
        }
    }

    public String getDob(){
        return dob;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }
}
