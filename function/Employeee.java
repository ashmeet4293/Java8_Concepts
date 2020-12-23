package com.company.practice.function;

class Employeee {
    String name;
    double salary;

    public Employeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
