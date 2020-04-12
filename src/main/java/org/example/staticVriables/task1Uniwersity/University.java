package org.example.staticVriables.task1Uniwersity;

import org.example.staticVriables.task1Uniwersity.Student;

public class University {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 3;
        Student student = new Student();
        Student[] students = new Student[MAX_STUDENTS];
        students[0] = new Student("Adam", "Nowak", 125);
        students[1] = new Student("Roman", "Kowalski", 1545);
        students[2] = new Student("Kasia", "Kalisz", 525);
        System.out.println("Liczba studentów na uniwersytecie " + student.getStudentsNumber());
        for (Student studentOfUniversity : students) {
            System.out.println(studentOfUniversity.getFirstName() + " " + studentOfUniversity.getLastName() +
                    " " + studentOfUniversity.getNumber());
        }
    }
}
