package com.jackdurrant.student;

/**
 * Created by Administrator on 06/11/2017.
 */
public class Main {

    private static Student[] classes = new Student[5];

    public static void main(String[] args) {

        Student harry = new Student(501191, "Harry Potter", 19, "+44 7700900587", false);
        Student dean = new Student(501192, "Dean Thomas", 21, "+44 7700900695", true);
        Student hermione = new Student(501193, "Hermione Granger", 20, "+44 7700900598", true);
        Student ron = new Student(501194, "Ron Weasley", 20, "+44 7700900192", true);
        Student ginny = new Student(501195, "Ginny Weasley", 19, "+44 7700900193", false);

        classes[0] = harry;
        classes[1] = dean;
        classes[2] = hermione;
        classes[3] = ron;
        classes[4] = ginny;

        listStudents();
    }

    public static void listStudents() {

        double totalAges = 0;
        int evenAges = 0;
        int drivers = 0;

        for(Student student : classes) {

            student.printInfo();

            int age = student.getAge();

            totalAges += age;
            if(age % 2 == 0) evenAges++;

            if(student.getDrives()) drivers++;
        }

        double averageAge = totalAges / classes.length;

        System.out.printf("Avg. age:\t%.1f\n", averageAge);
        System.out.printf("Even ages:\t%d\n", evenAges);
        System.out.printf("Drivers:\t%d\n", drivers);
    }
}
