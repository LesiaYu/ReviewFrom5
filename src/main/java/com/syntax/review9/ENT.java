package com.syntax.review9;

public class ENT extends Doctor{

    String location;

    ENT(String firstName, String lastName, String speciality, String location){
        super(firstName, lastName, speciality);
        this.location=location;
    }

    public void prescribeMedicine(String medicine) {
        System.out.println("ENT doctors prescribes " + medicine + " when needed");
    }

    public void inspect(String bodyPart){
            System.out.println("Ent doctor checks "+bodyPart);
    }


    public static void main(String[] args) {
        ENT ent=new ENT("John", "Snow", "Ent", "MaryLand");
        ent.printInfo();
        ent.treat();
        ent.treat("John Wick");
        ent.prescribeMedicine("Fluticasone nasal preparations");
        ent.inspect("Nose");

        Doctor ent1=new ENT("John", "Wick", "Ent", "Miami");
        ent1.printInfo();
        ent1.treat();
        ent1.treat("John");
        ent1.prescribeMedicine("Some medicine"); //runtime polymorfism

    }
  }


