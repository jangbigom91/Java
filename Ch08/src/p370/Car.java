package p370;

import p367.HankookTire;
import p367.Tire;

public class Car {
	
	Tire[] tires = {new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire()};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
