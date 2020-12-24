package com.company.practice.bifunction;

import java.util.function.BiFunction;

class Employee{
    int employeeNumber;
    String name;
    double dailyWages;

    public Employee(int employeeNumber, String name, double dailyWages) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.dailyWages = dailyWages;
    }
}
class  TimeSheet{
    int employeeNo;
    double days;

    public TimeSheet(int employeeNo, int days) {
        this.employeeNo = employeeNo;
        this.days = days;
    }
}

public class ProgramToCalculateMonthlySalaryWithEmployeeAndTimeSheet {
    public static void main(String[] args) {

        BiFunction<Employee,TimeSheet,Double> getMonthlySalary=(employee, timeSheet) -> {
            return employee.dailyWages* timeSheet.days;
        };
        Employee employee=new Employee(24, "Ashmeet Tiwari", 56.60);
        TimeSheet timeSheet= new TimeSheet(24, 20);

        System.out.println("Employee Total Salary : "+getMonthlySalary.apply(employee, timeSheet));


    }
}
