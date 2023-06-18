package com.syntax.review8;

public class Doctor {

   public String  firstName, lastName;
    protected String speciality;
    int yearsOfExperience;
    private   double salary;

    public static boolean degree;

      Doctor(String  firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Doctor(String  firstName, String lastName, String speciality){
        this(firstName, lastName);
        this.speciality=speciality;
    }

    public void printInfo(){
        System.out.println("Doctors name is "+firstName+" "+lastName+". And speciality is  "+speciality);
    }

    protected void treat(){
        System.out.println("Doctors treat patiences");
    }

    void  prescribeMedicine(String medicine){
        System.out.println("Doctor prescribed "+medicine);
    }

   private  double getSalary(){
       return salary;
    }
}
