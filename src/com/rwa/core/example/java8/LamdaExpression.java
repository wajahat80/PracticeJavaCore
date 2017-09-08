package com.rwa.core.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExpression {

	public static void main(String[] args) {
		System.out.println("Starting Program...");

		/*
		 * Using Custom Functional interface that takes one int and print that int
		 */
		MyFuncInterface mfi = (int i) -> System.out.println(i);
		mfi.printTwoNumbers(77);

		int[] i = { 1, 2, 3, 4, 5, 6, 7, 11 };

		/*
		 * **************** Another Example *****************
		 */
		Person p1 = new Person("Raja", 37);
		Person p2 = new Person("Hibbah", 4);
		Person p3 = new Person("Jia", 30);

		List<Person> lp = new ArrayList<Person>();
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);

		Predicate<Person> predicate = p -> p.getAge() > 20;

		LamdaExpression.filterList(lp, predicate).forEach(System.out::println);

	}

	public static List<Person> filterList(List<Person> listOfPersons, Predicate<Person> predicate) {
		List<Person> filteredList = new ArrayList<Person>();
		for (Person person : listOfPersons) {
			if (predicate.test(person)) {
				filteredList.add(person);
			}
		}
		return filteredList;
	}

}

/*
 * This is a custom functional interface which constains only one abstract
 * method i.e. printTwoNumbers
 */
interface MyFuncInterface {
	public void printTwoNumbers(int i);
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
