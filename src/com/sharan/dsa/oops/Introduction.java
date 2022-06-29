package com.sharan.dsa.oops;

public class Introduction {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student kunal;
//        kunal = new Student();

        Student kunal = new Student(15, "sharan raj", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);

//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 88.5f;


//        kunal.changeName("Shoe lover");
//        kunal.greeting();

//
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    Student() {
        // this is how you call a constructor from another constructor
        this(13, "default person", 100.0f);
    }

//    Student() {
//        this.rno = 13;
//        this.name = "sharan raj";
//        this.marks = 82.8f;
//    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }
}
