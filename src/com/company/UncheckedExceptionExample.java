package com.company;

import java.util.Scanner;

public class UncheckedExceptionExample {

    public static void main(String[] args) {
        run();
    }




    private static void run() {
        try {
            System.out.println(getEmail()); //NullPointerException
        } catch (GeneralAPIException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println("-------------");
        System.out.println("Another one (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        if (option.equals("yes")) {
            run();
        }
    }

    private static String getEmail() {
        if (true) {
            throw new NullPointerException("Error occurred: NullPointerException");
        }
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if (!email.contains("@")) {
            throw new EmailIncorrectFormatException();
        }

        if (email.length() > 10) {
            throw new EmailTooLongException();
        }

        if (email.length() < 2) {
            throw new EmailTooShortException();
        }

        return email;
    }


}


class GeneralAPIException extends RuntimeException {
    private static String defaultMessage = "General error occurred";

    public GeneralAPIException() {

        super(defaultMessage);
    }


    protected GeneralAPIException(String message) {
        super(message);
    }
}

class EmailIncorrectFormatException extends GeneralAPIException {
    private static String defaultMessage = "Email format is incorrect";

    public EmailIncorrectFormatException() {
        super(defaultMessage);
    }
}

class EmailTooShortException extends GeneralAPIException {
//    private static String defaultMessage = "email.length.short";

    private static String defaultMessage = "Email is too short";

    public EmailTooShortException() {
        super(defaultMessage);
    }
}

class EmailTooLongException extends GeneralAPIException {
    //    private static String defaultMessage = "email.length.long";
    private static String defaultMessage = "Email is too long";

    public EmailTooLongException() {
        super(defaultMessage);
    }
}