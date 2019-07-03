package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student: getStudents()) {
            if (student.getAverageGrade() == averageGrade) return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student studentWithmaxAverageGrade = null;
        double maxAverageGrade = 0.0;
        for (Student student: getStudents()) {
            if (student.getAverageGrade() > maxAverageGrade) {
                maxAverageGrade = student.getAverageGrade();
                studentWithmaxAverageGrade = student;
            }
        }
        return studentWithmaxAverageGrade;
    }

   public Student getStudentWithMinAverageGrade() {
       Student studentWithminAverageGrade = null;
       double minAverageGrade = 10.1;
       for (Student student: getStudents()) {
           if (student.getAverageGrade() < minAverageGrade) {
               minAverageGrade = student.getAverageGrade();
               studentWithminAverageGrade = student;
           }
       }
       return studentWithminAverageGrade;
   }

    public void  expel(Student student) {
        getStudents().remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getAge() {
        return age;
    }

    public List<Student> getStudents() {
        return students;
    }
}