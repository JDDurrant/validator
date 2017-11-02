package com.jackdurrant.libraries;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Prompt {

    private static Scanner scan = new Scanner(System.in);

    public static String getString(String message) {

        fullPrompt(message);
        return scan.nextLine();
    }

    public static String fieldString(String message) {

        slimPrompt(message);
        return scan.nextLine();
    }

    public static int getInteger(String message) {

        fullPrompt(message);
        return scan.nextInt();
    }

    public static int fieldInteger(String message) {

        slimPrompt(message);
        return scan.nextInt();
    }

    public static Date getTime(String message) throws ParseException {

        DateFormat format = new SimpleDateFormat("hh:mm");

        slimPrompt(message);
        String time = scan.nextLine();

        return format.parse(time);
    }

    public static double getDouble(String message) {

        fullPrompt(message);
        return scan.nextDouble();
    }

    public static double getCurrency(String message) {

        customPrompt(message, "£");
        return scan.nextDouble();
    }

    public static boolean getBoolean(String message) {

        fullPrompt(message);
        return scan.nextBoolean();
    }

    private static void fullPrompt(String message) {

        System.out.printf("%s\n> ", message);
    }

    private static void slimPrompt(String message) {

        System.out.printf("%s: ", message);
    }

    private static void customPrompt(String message, String prompt) {

        System.out.printf("%s\n%s", message, prompt);
    }

    public static void pause(String message) {

        System.out.println(message);
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
