package com.garza.classinterface;

public class Paycheck implements payroll{
	
	private double totalHours;
	private double hourlyRate;
	
	public Paycheck() {
		totalHours = 0.0;
		hourlyRate = 0.0;
	}
	
	public Paycheck(double totalHours, double hourlyRate) {
		this.totalHours = totalHours;
		this.hourlyRate = hourlyRate;
	}
	
	public void setTotalHours(double inputHours) {
		this.totalHours = inputHours;
	}
	
	public void setHourlyRate(double inputPayRate) {
		this.hourlyRate = inputPayRate;
	}
	
	public double getTotalHours() {
		return this.totalHours;
	}
	
	public double getHourlyRate() {
		return this.hourlyRate;
	}
	
	@Override
	public double regularPay() {
		double regHours;
		double myPay;
		if (totalHours > 40.0) {
			regHours = 40.0;
		} else {
			regHours = totalHours;
		}
		myPay = regHours * hourlyRate;
		
		return myPay;
	}

	@Override
	public double overTimepay() {
		double OThours = 0;
		double OTpay;
		if (totalHours > 40.0) {
			OThours = totalHours - 40.0;
		}
		
		OTpay = OThours * (hourlyRate * 1.5);
		return OTpay;
	}

	@Override
	public double totalPay() {
		double myTotalPay = regularPay() + overTimepay();
		
		return myTotalPay;
	}

}


