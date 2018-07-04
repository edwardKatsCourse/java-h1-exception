package com.company;

public class ExceptionMain {

    public static void main(String[] args) throws Exception {
        //throw, throws, try, catch, finally

        //1
        //2
        print();        //exception
        //4
        //5
    }

    private static void print() throws Exception {
        System.out.println("before");

        if (true) {
            throw new Exception("some error occurred");
        }
        System.out.println("after");
        //calculation
        //printing
    }
}
