package com.rwa.core.example.java8;

public class EmployeeLambda {

	public static void main(String[] args) {
		// Employee[] empArr = { new Employee("C", 66), new Employee("B", 22), new
		// Employee("A", 33) };
		// List<Employee> unSortedList = Arrays.asList(empArr);
		//
		// // Printing list unsorted
		// for (Employee emp : unSortedList) {
		// emp.toString();
		// }
		//
		// ArrayList<String> al = new ArrayList<String>();
		// al.add("Geeks For Geeks");
		// al.add("Friends");
		// al.add("Dear");
		// al.add("Is");
		// al.add("Superb");
		// Collections.sort(al);

	}

}

class Employee {
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
		System.out.println("name:" + this.name + " and age: " + this.age);
		return "name:" + this.name + " and age: " + this.age;
	}

}
