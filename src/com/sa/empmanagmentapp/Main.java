package com.sa.empmanagmentapp;

import java.util.*;

public class Main {
	EmployeeService service = new EmployeeService();
	static boolean ordering = true;
	public static void menu() {
		System.out.println("**************Welcome to the Employee Management System**********"
				+ "\n1. Add Employee"
				+ "\n2. View Employee"
				+ "\n3. Update Employee"
				+ "\n4. Delete Emplyee"
				+ "\n5.View All Employee"
				+ "\n6. Exit");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		
		do {
			menu();
			System.out.print("Enter your Choice");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				break;
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee");
				service.updateEmplyee();
				break;
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("View All  Employee");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("Thankyou for using app!");
				System.exit(0);
			default:
				System.out.println("Please enter the valid choice");
			}
		} while(ordering);
	}
}
