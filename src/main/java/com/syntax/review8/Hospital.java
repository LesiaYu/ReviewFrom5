package com.syntax.review8;

public class Hospital {
    public static void main(String[] args) {

        Doctor dog = new Doctor("Lesia","Yushchyshyn");
        dog.printInfo();
        Doctor dog2= new Doctor("Jane", "Smith","cardiologyst");
        dog2.printInfo(); //public
        dog2.treat();    //protected
        dog2.prescribeMedicine("antobiotics"); //default
        // dog2.getSalary is private
    }

}
