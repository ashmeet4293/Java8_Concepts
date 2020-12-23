package com.company.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Progarm to perform Salary Increment for Employees by using Predicate  Function
 */
public class ProgramToPeformSalaryIncrementUsingPredicateAndFunction {
    public static void main(String[] args) {

        /*Predicate To check whether the salary is less than 35000*/
        Predicate<Double> salaryCheckPredicate = (salary) -> salary < 35000;
        Function<Employeee, Employeee> salaryIncrementFunction = (emp) -> {

            emp.salary += 5000;
            return emp;

        };

        List<Employeee> employeees = new ArrayList<>();
        employeees.add(new Employeee("Ashmeet", 57000));
        employeees.add(new Employeee("Ram", 16000));
        employeees.add(new Employeee("Pawan", 5000.56));

        List<Employeee> employeeesWithSalaryIncrement = new ArrayList<>();

        employeees.forEach(employeee -> {
            if (salaryCheckPredicate.test(employeee.salary)) {
                employeeesWithSalaryIncrement.add(salaryIncrementFunction.apply(employeee));
            }
        });


        System.out.println(employeeesWithSalaryIncrement);

    }
}
