package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class EmployeeDTO {
    String displayName;
    String salaryInfo;

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSalaryInfo() {
        return salaryInfo;
    }
}
//Employee를 EmployeeDTO로 변환하세요. displayName은 "Mr./Ms. {name}", salaryInfo는 "Salary: ${salary}"
// 예상 출력:`[EmployeeDTO(Mr./Ms. Kim, Salary: $50000.0), ...]`

public class StreamQuestion7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );
        List<EmployeeDTO> EmployeeDTO = employees.stream()
                .map(DTO -> new EmployeeDTO (
                        " Mr. / Ms. " + DTO.getName(),
                        " Salary : $" + DTO.getSalary()
                )).toList();
        System.out.println(EmployeeDTO);
    }
}
