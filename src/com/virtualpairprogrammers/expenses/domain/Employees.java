package com.virtualpairprogrammers.expenses.domain;

public class Employees {

    private Employee[] employees;

    public Employees(int numberOfEmployees) {
        employees = new Employee[numberOfEmployees];
    }

    public void addEmployee(Employee employee) {
        int firstPositionEmpty = -1;
        for (int i = 0; i < employees.length; i++) {
            if (firstPositionEmpty == -1 && employees[i] == null) {
                firstPositionEmpty = i;
            }
        }
        if (firstPositionEmpty == -1) {
            System.out.println("Sorry - The array is full!");
        }
        else {
            employees[firstPositionEmpty] = employee;
        }
    }

    public void printEmployees() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.getMailingName());
            }
        }
    }

    public Employee findBySurname(String surname) {
        for (Employee e : employees) {
            if (e != null && e.getSurname().equals(surname)) {
                System.out.println(surname);
                return e;
            }
        }
        return null;
    }
}
