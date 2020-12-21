package com.company.practice.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
    String name;
    String designation;
    double salary;
    String location;

    public Employee(String name, String designation, double salary, String location) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}

public class EmployeeManagementApplication {

    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<>();
        populateEmployeeMockData(employeeList);

        Predicate<Employee> predicateEmployeeIsSoftwareDeveloper= (employee)-> employee.designation.equalsIgnoreCase("Software Developer");
        Predicate<Employee> predicateEmployeeIsFromPokhara= (employee)-> employee.location.equalsIgnoreCase("Pokhara");
        Predicate<Employee> predicateEmployeeSalary= (employee)-> employee.salary < (20000);



        display(predicateEmployeeIsSoftwareDeveloper, employeeList);
        System.out.println("Displaying Employee from Pokhara");
        display(predicateEmployeeIsFromPokhara, employeeList);
        System.out.println("Displaying Employees having salary < 20000");
        display(predicateEmployeeSalary, employeeList);
        System.out.println("____Displaying Employees Which is Software Developer and From Pokhara___");
        display(predicateEmployeeIsSoftwareDeveloper.and(predicateEmployeeIsFromPokhara), employeeList);
        System.out.println("____Displaying Employees Which is Software Developer or salary is < 20000___");
        display(predicateEmployeeIsSoftwareDeveloper.or(predicateEmployeeSalary), employeeList);
        System.out.println("____Displaying Employees Who are not Software Developer");
        display(predicateEmployeeIsSoftwareDeveloper.negate(), employeeList);


    }

    public static void populateEmployeeMockData(List<Employee> employees) {
        employees.add(new Employee("Ram","Manager", 120000, "Pokhara"));
        employees.add(new Employee("Sita","Software Developer", 60000, "Kathamndu"));
        employees.add(new Employee("Ashmeet","Software Developer", 70000, "Pokhara"));
        employees.add(new Employee("Pujan","Software Architect", 40000, "Pokhara"));
        employees.add(new Employee("Ramesh","Frontend Developer", 50000, "Pokhara"));
        employees.add(new Employee("Puspa","Accountant", 10000, "Kathmandu"));
        employees.add(new Employee("Pawan","Software Developer", 30000, "Pokhara"));

    }

    public static void display(Predicate<Employee> predicate, List<Employee> employees){
        employees.forEach(employee -> {
            if(predicate.test(employee)){
                System.out.println(employee);
            }
        });
    }
}
