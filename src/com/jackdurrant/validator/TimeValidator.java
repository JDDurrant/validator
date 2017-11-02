package com.jackdurrant.validator;

import com.jackdurrant.libraries.Prompt;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by jack on 02/11/17.
 */
public class TimeValidator {

    public static void main(String[] args) throws ParseException {

        System.out.println("Welcome to Time Validator! Enter two time periods to add together.");

        Date time1 = Prompt.getTime("Time 1");
        Date time2 = Prompt.getTime("Time 2");

        System.out.println(time1);
        System.out.println(time2);
    }
}
