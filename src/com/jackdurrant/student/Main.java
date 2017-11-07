package com.jackdurrant.student;

/**
 * Created by Administrator on 06/11/2017.
 */
public class Main {

    private static Student[] classes = new Student[5];

    public static void main(String[] args) {

        Student harry = new Student("Harry Potter", 19, "+44 7700900587", false);
        Student dean = new Student("Dean Thomas", 21, "+44 7700900695", false);
        Student hermione = new Student("Hermione Granger", 20, "+44 7700900598", true);
        Student ron = new Student("Ron Weasley", 20, "+44 7700900192", true);
        Student ginny = new Student("Ginny Weasley", 19, "+44 7700900193", false);

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
