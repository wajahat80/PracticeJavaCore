package com.core;

class Dummy {
	byte x;
}

class Add {
	public static void main(String[] args) throws Exception {
		Add a = new Add();
		a.start();
	}

	void start() {
		Dummy d = new Dummy();
		System.out.println(d.x + " ");
		Dummy d2 = fix(d);

		System.out.println(d.x + " " + d2.x);

		d2.x = 44;

		System.out.println(d.x + " " + d2.x);
		
		System.out.println(d.equals(d2));

	}

	Dummy fix(Dummy tt) {
		tt.x = 42;
		return tt;
	}
}