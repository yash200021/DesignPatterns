package com.yash.designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
//        Student student = Student.getBuilder()
//                          .setRollNo(1)
//                .setAge(65)
//                .setBatch("hoo")
//                .setGender("Male")
//                .setName("Yash")
//                .build();

        Student student1 = Student.getBuilder()
                .setRollNo(2)
                .setAge(20)
                .setBatch("hoo")
                .setGender("Female")
                .setName("Gudiya")
                .setPsp(96.0)
                .build();

        System.out.println(student1);
    }
}
