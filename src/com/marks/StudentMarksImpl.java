package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {

        StudentsMarks object = new StudentsMarks();

        System.out.println("Students marks of non-medical studies : " + object.calculateMarks(97,95,96));
        System.out.println("Students marks of medical studies : " + object.calculateMarks(95,90,85,80));
        System.out.println("Students marks of buisness studies : " + object.calculateMarks(74.55,76.69,69.69));
    }
}
