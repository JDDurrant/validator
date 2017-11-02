package com.jackdurrant.validator;

import com.jackdurrant.libraries.Prompt;

public class StringValidator {

    public static void main(String[] args) {

        System.out.println("Welcome to String Validator! Please enter some data.");
        String source = Prompt.fieldString("Source").toLowerCase();
        String search = Prompt.fieldString("Search").toLowerCase();

        if (source.equals(search)) {
            System.out.println("Match!");
            return;
        }

        if (source.startsWith(search)) {
            System.out.println("Starts with");
            return;
        }

        if (source.endsWith(search)) {
            System.out.println("Ends with");
            return;
        }

        if (source.contains(search)) {
            System.out.println("Contains");
            return;
        }
    }
}
