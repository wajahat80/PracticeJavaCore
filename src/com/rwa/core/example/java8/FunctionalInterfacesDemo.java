package com.rwa.core.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * functional interface has a single abstract method, called the functional method 
 * for that functional interface, to which the lambda expression's parameter and return types 
 * are matched or adapted.
 */
public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		List<Patient> lstPatient = new ArrayList<Patient>();

		// Add 3 patients
		lstPatient.addAll(
				Arrays.asList(new Patient[] { new Patient(1, "Patient A", 2), new Patient(2, "Patient B", 14), new Patient(3, "Patient C", 39) }));
		
		//System::println();
	}

}

class Patient {

	int id;
	String name;
	int age;

	public Patient(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
