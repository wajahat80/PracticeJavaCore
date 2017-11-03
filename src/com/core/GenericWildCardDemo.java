package com.core;

public class GenericWildCardDemo {

	public static void main(String... args) throws IllegalAccessException, InstantiationException {

		GenericFactory<GenTestA> factory = new GenericFactory<GenTestA>(GenTestA.class);
		GenTestA myClassInstance = factory.createInstance();

		GenericFactory<GenTestB> factory2 = new GenericFactory<GenTestB>(GenTestB.class);
		GenTestB myClassInstance2 = factory2.createMyClassInstance(GenTestB.class);

		GenTestA obj1 = GenTestB.getInstance(GenTestA.class);

	}

}

// <T> define a type of Class
class GenericFactory<T> {

	Class theClass = null;

	public GenericFactory(Class theClass) {
		this.theClass = theClass;
	}

	public T createInstance() throws IllegalAccessException, InstantiationException {
		return (T) this.theClass.newInstance();
	}

	public T createMyClassInstance(Class<T> obj) throws InstantiationException, IllegalAccessException {

		return (T) obj.newInstance();
	}
}

class GenTestA {
	GenTestA() {
		System.out.println("Constructor of GenTestA");
	}
}

class GenTestB {
	GenTestB() {
		System.out.println("Constructor of GenTestB");
	}

	// <K> Defining a type. Since K in argument is unknown
	public static <K> K getInstance(Class<K> obj) throws InstantiationException, IllegalAccessException {
		return obj.newInstance();
	}
}
