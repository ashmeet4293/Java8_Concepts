package com.company.practice.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProgramToFindTotalMontlySalaryOfAllEmployee {
    public static void main(String[] args) {

        Function<List<Employeee> , Double> totalMonthlySalaryFunction = (employee)->{
          double totalSalary=0;
            for (Employeee currentEmployee: employee         ) {
                totalSalary=totalSalary+currentEmployee.salary;
            }

          return totalSalary;
        };

        List<Employeee> employeees = new ArrayList<>();
        employeees.add(new Employeee("Ashmeet", 7000));
        employeees.add(new Employeee("Ram", 16000));
        employeees.add(new Employeee("Pawan", 4500.56));

        System.out.println(employeees);

        System.out.println("Total Salary is : "+totalMonthlySalaryFunction.apply(employeees));


    }
}
