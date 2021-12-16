package com.garza.classinterface;

import java.util.Scanner;

import com.garza.classinterface.Paycheck;

public class PaycheckTest {

	public static void main(String[] args) {
		
		System.out.println("Henlo Werld");
		
		//USING DEFAULT CONSTRUCTOR AND SETTERS
		//Paycheck myPaycheck = new Paycheck();
		//myPaycheck.setHourlyRate(15);
		//myPaycheck.setTotalHours(50);
		
		//USING SECOND CONSTRUCTOR WITH PARAMETERS
		Paycheck myPaycheck = new Paycheck(50.0, 15.0);
			
		System.out.println("Hourly Rate: " + myPaycheck.getHourlyRate());
		System.out.println("Total Hours: " + myPaycheck.getTotalHours());
		System.out.println("Regular pay: " + myPaycheck.regularPay());
		System.out.println("OT pay:      " + myPaycheck.overTimepay());
		System.out.println("Total pay:   " + myPaycheck.totalPay());
	}

}
