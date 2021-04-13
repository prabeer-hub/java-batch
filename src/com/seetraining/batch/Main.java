package com.seetraining.batch;

import com.seetraining.batch.cars.Bike;
import com.seetraining.batch.cars.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.tyres("Car has 8 tyres"));
		System.out.println(c.seats("Car has 2 seats"));
		Bike b = new Bike();
		b.seats();
	}

}
