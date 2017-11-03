package com.core;

public class EnumDemo {

	public static void main(String[] args) {
		/*System.out.println(Country.AUSTRALIA);
		System.out.println(Country.AUSTRALIA.getCurrency());
		System.out.println(Country.AUSTRALIA.getCurrency().getValue());*/

		for (Country c : Country.values()) {

			System.out.println(
					"Country: " + c + " | Currency: " + c.getCurrency() + " | Value: " + c.getCurrency().getValue());
		}
	}
}

enum Country {

	PAKISTAN, AUSTRALIA, UK;

	Currency getCurrency() {
		switch (this) {
		case PAKISTAN:
			return Currency.RUPEE;
		case AUSTRALIA:
			return Currency.DOLLAR;
		case UK:
			return Currency.POUNDSTERLING;
		}

		return Currency.DEFAULT;
	}
}

enum Currency {

	DOLLAR(80), RUPEE(1), POUNDSTERLING(150), DEFAULT(0);

	private int value;

	private Currency(int i) {
		this.value = i;
	}

	int getValue() {
		return this.value;
	}

}
