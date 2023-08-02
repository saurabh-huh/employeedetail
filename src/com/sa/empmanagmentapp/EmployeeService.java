package com.sa.empmanagmentapp;
import java.util.*;

public class EmployeeService {
	HashSet<Employee> empset = new HashSet<>();
	Employee emp1 = new Employee(101,"Shital",24,"Developer","IT",25000);
	Employee emp2 = new Employee(102,"Meena",26,"Tester","CO",15000);
	Employee emp3 = new Employee(103,"Bob",34,"DevOps Eng","Admin",35000);
	Employee emp4 = new Employee(104,"Max",26,"System Eng","CO",40000);
	
	Scanner sc = new Scanner(System.in);
	
	boolean found;
	int id;
	int age;
	String name;
	String department;
	String desiganation;
	double sal;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	
	//View all Emps
	
	public void viewAllEmps() {
		for(Employee emp : empset) {
			System.out.println(emp);
		}
	}
	// view employee based on the id
	
	public void viewEmp() {
		found = false;
		System.out.println("Enter ID:");
		id = sc.nextInt();
		for(Employee emp : empset) {
			if(emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}	
		}
		if(!found)
			System.out.println("Employee not found of id:"+id);
	}
	
	//update the employee
	
	public void updateEmplyee() {
		found = false;
		System.out.println("Enter Id:");
		id = sc.nextInt();
		
		for(Employee emp : empset) {
			if(emp.getId() == id) {
				System.out.println(emp);
				System.out.println("Enter name:");
				name = sc.next();
				System.out.println("Enter Salary:");
				sal = sc.nextDouble();
				System.out.println("Updated detail of employee:");
				System.out.println(emp);
				found = true;
			}
		}
		if(!found)
			System.out.println("Employee is not present");
		else
			System.out.println("Detail updated successfully");
	}
	
	// delete emp detail
	public void deleteEmp() {
		found = false;
		System.out.println("Enter Id:");
		id = sc.nextInt();
		Employee empdelete = null;
		for(Employee emp : empset) {
			if(emp.getId() == id) {
				empdelete = emp;
				found = true;
			}	
		}
		if(!found)
			System.out.println("Employee is not present");
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	
	// Add emp
	public void addEmp() {
		System.out.println("Enter Id:");
		id = sc.nextInt();
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter age:");
		age = sc.nextInt();
		System.out.println("Enter the desiganation:");
		desiganation = sc.next();
		System.out.println("Enter the department:");
		department = sc.next();
		System.out.println("Enter the salary:");
		sal = sc.nextDouble();
		
		Employee emp = new Employee(id,name,age,desiganation,department,sal);
		
		empset.add(emp);
		
		System.out.println(emp);
		System.out.println("Employee Added successfully!!");
		
		
		
		
	}
}
