package com.javarush.task.task29.task2909.human;

public class Worker extends Human {
    private double salary;
    private String company;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}