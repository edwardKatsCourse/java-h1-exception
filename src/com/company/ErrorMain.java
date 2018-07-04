package com.company;

public class ErrorMain {

    public static void main(String[] args) {
	    //Exceptions
        //Nested classes (static nested and nested inner)

        System.out.println(a());
        //OS  <->   JVM   <->   code

    }

    public static int a() {
        return a();
    }
}
