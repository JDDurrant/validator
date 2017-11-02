package com.jackdurrant.validator;

import com.jackdurrant.libraries.Prompt;

import java.text.ParseException;
import java.util.Calendar;
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

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(time1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(time2);

        int hour1 = calendar1.HOUR;
        int minute1 = calendar1.MINUTE;
        int hour2 = calendar2.HOUR;
        int minute2 = calendar2.MINUTE;

        System.out.println(hour1);
        System.out.println(hour2);
        System.out.println(minute1);
        System.out.println(minute2);

        int hourTotal = hour1 + hour2;
        int minuteTotal = minute1 + minute2;

        System.out.printf("Total: %d:%d", hourTotal, minuteTotal);
    }
}
