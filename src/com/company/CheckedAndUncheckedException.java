package com.company;

public class CheckedAndUncheckedException {


    public static void printChecked() throws Exception {
        throw new Exception();
//        try {
//        } catch (Exception e) {
//            System.out.println("solving the problem");
//        }
    }

    public static void printUnchecked() /*throws RuntimeException*/ {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            printChecked();

        } catch (Exception e) {
            System.out.println("Recovering...");
        }
    }


}
