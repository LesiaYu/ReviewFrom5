package com.syntax.review8;

public class Fruit {

    public String name, color;

    Fruit(String name, String color){
        this.name=name;
        this.color=color;
    }
    public void eat(){
        System.out.println("We can eat "+name);
    }
}

class Mango extends Fruit {

    int price;
    Mango(String name, String color, int price){
        super (name,color);
        this.price=price;
    }
    protected void grow(String country) {
        System.out.println(name + " grows in " + country);
    }
}
class Apple extends Fruit{
    Apple(String name, String color){
        super (name,color);
    }
    protected void makeJuice(){
        System.out.println("We can make "+name+" juice");
    }
}

class BabyApple extends Apple{

   BabyApple(String name, String color){
        super (name,color);
    }

    void print(){
        System.out.println(name+" is very small");
    }
}
