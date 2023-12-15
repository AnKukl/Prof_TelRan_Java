package com.proftelran.Homework.StreamAPI2.Task3;

import java.util.Arrays;
import java.util.List;

public class StudentsApp {

    public static void main(String[] args) {
        List<Student> beckEndStudents = Student.generateStudents(ClassType.BA);
        List<Student> frontEndStudents = Student.generateStudents(ClassType.FE);
        List<Student> qAStudents = Student.generateStudents(ClassType.QA);

        List<List<Student>> studentsList = Arrays.asList(beckEndStudents, frontEndStudents, qAStudents);

        List<ProjectStudent> projectStudents = studentsList.stream().flatMap(list -> list.stream())
                .filter(student -> student.getRate() >= 4.5 && student.isFinished() == true)
                .map(student -> {
                    if (student instanceof BackEndStudent) {
                        student.setType(ClassType.BA);
                    } else if (student instanceof FrontEndStudent) {
                        student.setType(ClassType.FE);
                    } else if (student instanceof QAStudent) {
                        student.setType(ClassType.QA);
                    } else {
                        student.setType(null);
                    }
                    return new ProjectStudent(student.getName(), student.getRate(), student.getType());
                })
                .toList();

        System.out.println("All Project Students:");
        projectStudents.stream().forEach(student -> {
            System.out.print("Name: " + student.getName() + ", Rate: ");
            System.out.format("%.1f", student.getRate());
            System.out.print(", Type: " + student.getType());
            System.out.println();
        });


    }
}
