package p08.textbook.s080503;

import p07.textbook.s070308.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();

		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();

		myCar.run();
	}
}
