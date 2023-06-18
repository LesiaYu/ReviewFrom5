package com.syntax.review7;

public class MethodsTest {
    public static void main(String[] args) {

            JavaMethods jm=new JavaMethods();
            jm.hello();
            jm.helloName("Lesia");
            // jm.helloName('J');  CE: we do not have method helloName that accepts char as a parameter


        double temp=jm.convertTemp(36.6);
        System.out.println(temp);

       String [] arr= jm.words("Today is May 4");
       for (String str:arr) {
           System.out.println(str);
       }

        //System.out.println(str); CE: is not visible
    }
}
