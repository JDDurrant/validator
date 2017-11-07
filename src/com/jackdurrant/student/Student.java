package com.jackdurrant.student;

/**
 * Created by Administrator on 06/11/2017.
 */
public class Student {

    private int id;
    private Name name;
    private int age;
    private PhoneNumber mobileNumber;
    private boolean drives;

    public Student(Name name, int age, PhoneNumber mobileNumber, boolean drives) {

        this.id = ID.generate();
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.drives = drives;
    }

    public Student(String name, int age, String mobileNumber, boolean drives) {

        this(Name.parseName(name), age,
                PhoneNumber.parsePhoneNumber(mobileNumber), drives);
    }

    public void printInfo() {

        System.out.printf("%s, %d\n", name.getName(), age);
        System.out.printf("Mobile:\t%s\n", mobileNumber.getPhoneNumber());
        System.out.printf("Drives:\t%s\n",  drives ? "Yes" : "No");
        System.out.printf("ID #:\t%d\n", id);
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public boolean getDrives() {
        return drives;
    }
}
