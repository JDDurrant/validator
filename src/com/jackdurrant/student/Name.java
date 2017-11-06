package com.jackdurrant.student;

/**
 * Created by Administrator on 06/11/2017.
 */
public class Name {

    protected String firstName;
    protected String lastName;

    public Name(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {

        return String.format("%s %s", firstName, lastName);
    }

    public static Name parseName(String fullName) {

        String[] names = fullName.split(" ", 2);

        return new Name(names[0], names[1]);
    }
}
