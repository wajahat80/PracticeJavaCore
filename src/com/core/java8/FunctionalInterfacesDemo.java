package com.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * functional interface has a single abstract method, called the functional method 
 * for that functional interface, to which the lambda expression's parameter and return types 
 * are matched or adapted.
 */
public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		Patient p1 = new Patient(1, "Patient A", 2);
		Patient p2 = new Patient(2, "Patient B", 14);
		Patient p3 = new Patient(3, "Patient C", 39);

		List<Patient> lstPatient = new ArrayList<Patient>();

		// Add 3 patients
		lstPatient.addAll(Arrays.asList(new Patient[] { p1, p2, p3 }));

		/*
		 * Consumer Example ****************
		 */

		
		Consumer<Patient> cp = p -> System.out.println("Age" + p.getAge());// a consumer that will print age
		Consumer<Patient> cp2 = p -> p.setAge(33); //// a consumer that sets age to 33
		
		FunctionalInterfacesDemo.consumerPatient(p1, cp);
		FunctionalInterfacesDemo.consumerPatient(p1, cp2);
		System.out.println(p1.getAge()); // the value of age has changed as definded by cp2

		// The below line of code defines, a consumer that will print age
		cp = p -> System.out.println("name is" + p.getName());
		FunctionalInterfacesDemo.consumerPatientList(lstPatient, cp);

		/*
		 * Predicate Example *****************
		 */
		// The below line of code defines, a predicate that compares age
		Predicate<Patient> pred = p -> p.getAge() > 25;
		FunctionalInterfacesDemo.predicatePatient(p1, pred);
		
		Stream<Patient> sp = lstPatient.stream().filter(pred);
		
	}

	public static void consumerPatient(Patient p, Consumer<Patient> cp) {
		cp.accept(p); // at this point whatever is defined in consumer implementation, it will do that
	}

	public static void consumerPatientList(List<Patient> lp, Consumer<Patient> cp) {
		for (Patient p : lp) {
			cp.accept(p); // at this point whatever is defined in consumer implementation, it will do that
		}
	}

	public static void predicatePatient(Patient p, Predicate<Patient> pp) {
		boolean b = pp.test(p); // at this point return result on the basis of condition define in
								// Predicate<Patient>
		if (b)
			System.out.println("Patient Predicate condition is " + b);
		else
			System.out.println("Patient Predicate condition is " + b);
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
