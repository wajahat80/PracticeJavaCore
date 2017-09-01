package com.rwa.core.example.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		System.out.println("ComparableDemo...");

		Employee[] empArr = { new Employee("C", 66), new Employee("B", 22), new Employee("A", 33),
				new Employee("F", 13) };

		List<Employee> empList = Arrays.asList(empArr);

		System.out.println("\nPrinting unsorted list...");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
			;
		}

		System.out.println("\nSorting the collection...");
		Collections.sort(empList);

		System.out.println("\nPrinting sorted list...");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}

	}
}

class Employee implements Comparable<Employee> {
	String name;
	int age;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + this.name + " and age=" + this.age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("inside overrided method compareTo()....");
		return this.age - o.getAge();
	}

}