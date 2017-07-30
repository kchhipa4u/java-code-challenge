package com.oop.inheritance;

import java.math.BigDecimal;

public class ExerciseSolution {

	public static void main(String[] args) {
		double x = 4.0 - 3.10;
		System.out.println(x);
		
		BigDecimal b1 = BigDecimal.valueOf(4.0);
		BigDecimal b2 = BigDecimal.valueOf(3.10);
		BigDecimal b3 = b1.subtract(b2);
		System.out.println(b3);
		
		System.out.println(b3.equals(BigDecimal.valueOf(0.90)));
	}

}
