package SadanFactory;

import Component.Tire;

public class Sedan {

	public static void main(String[] args) {
		Tire compoTire = new Tire();
		
		compoTire.setSize(20);
		
		System.out.println(compoTire.getSize());
	}

}
