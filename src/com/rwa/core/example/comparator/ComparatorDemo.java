package com.rwa.core.example.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		System.out.println("ComparableDemo...");

		// Building an array of Customers
		Customer[] empArr = { new Customer("C", 66), new Customer("B", 22), new Customer("A", 33),
				new Customer("F", 13) };

		// Building a customer list using the array of Customer
		List<Customer> customerList = Arrays.asList(empArr);

		// Printing unsorted list
		System.out.println("\nPrinting unsorted list...");
		ComparatorDemo.printList(customerList);

		/*
		 * The below commented line will not work as it requires Customer class to
		 * implement Comparable interface which compare only one property. however, if
		 * we want sorted list of objects on the basis of different properties we use
		 * Comparator. We can implement different conditions for comparing and sorting
		 * and there is no need to change the Customer class
		 */

		// Collections.sort(customerList);

		/*
		 * The below code is to compare on the basis of age
		 */
		Collections.sort(customerList, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("\nPrinting sorted list, age wise...");
		ComparatorDemo.printList(customerList);

		/*
		 * The below code is to compare and sort on the basis of Customer name
		 */
		Collections.sort(customerList, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});

		System.out.println("\nPrinting sorted list, Name wise ...");
		ComparatorDemo.printList(customerList);

		/*
		 * Compare and sort before Java 8 lambda expression
		 */
		customerList.sort(new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getAge() - o2.getAge();
			}

		});

		/*
		 * Compare and sort using lambda expression
		 */
		customerList.sort((Customer o1, Customer o2) -> o1.getAge() - o2.getAge());

		/*
		 * Compare and sort using lambda expression,further simplified form of code
		 */
		customerList.sort((o1, o2) -> o1.getAge() - o2.getAge());

		System.out.println("\nPrinting sorted list using Lambda, Age wise ...");
		ComparatorDemo.printList(customerList);
	}

	static void printList(List<Customer> customerList) {
		for (Customer emp : customerList) {
			System.out.println(emp.toString());
		}
	}
}

/*
 * A simple POJO class for Customer having name and age properties
 */
class Customer {
	String name;
	int age;

	Customer(String name, int age) {
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

}