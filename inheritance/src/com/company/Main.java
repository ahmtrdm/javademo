package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();
        employeeManager.List();


    }
}
