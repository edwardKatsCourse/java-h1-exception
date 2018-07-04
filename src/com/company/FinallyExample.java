package com.company;

public class FinallyExample {

    public static void main(String[] args) {
        //        run();

//        throw new ArithmeticException();


        try {
            System.out.println("TRY: dividing by zero: 2/0");
            System.out.println(2 / 1);
//            String s = null;
//            System.out.println(s.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("CATCH: error occurred: " + e.getMessage());
        } finally {
            System.out.println("FINALLY");
        }


        //OS  <->   JVM   <->   code
        //notepad.exe    file.txt


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        try {
            //ОДОЛЖИДИ КНИГУ В БИБЛИОТЕКЕ
            System.out.println(2 / 0); //Arithmetic exception
        }  catch (GeneralAPIException e) {
            System.out.println("GeneralAPIException");



        } catch (RuntimeException e) {



            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");

        } finally {
            //ВОЗВРАЩАЕМ КНИГУ
        }

        //БИБЛИОТЕКА ЛИШИЛАСЬ КНИЖКИ
        //ТОТ, КОМУ ОНА НУЖНА ЕЕ НЕ ПОЛУЧИТ

        /*
        try {
        } finally {
        }
        */

        //если что-то произошло, неважно что
        //ИЛИ
        //не произошло
        try {

        } finally {

        }
    }
}
