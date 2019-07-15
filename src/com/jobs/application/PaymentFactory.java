package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public abstract class PaymentFactory implements IPaymentRate {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth-salaryPerMonth*15/100;
				}
		};
	}
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}

	public double pay(double salaryPerMonth) {
		return salaryPerMonth*1.5;
	}

	
	
	
	
	
}
