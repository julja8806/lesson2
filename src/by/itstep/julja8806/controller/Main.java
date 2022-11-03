package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.entity.Student;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge(-10);
        }catch (Exception e) {
//            IOException();
        }

    }
}
