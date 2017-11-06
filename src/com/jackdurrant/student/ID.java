package com.jackdurrant.student;

/**
 * Created by Administrator on 06/11/2017.
 */
public class ID {

    private static int next = 500192;

    public static int generate() {

        return next++;
    }
}
