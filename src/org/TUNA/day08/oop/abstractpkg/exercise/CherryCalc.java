package org.TUNA.day08.oop.abstractpkg.exercise;

import java.util.Scanner;

public class CherryCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		//int result = a + b;
	//	return result; 
				return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <a.length; i++)
			sum += a[i];
		double avg = (double)sum / a.length;
		return avg;
	}
}
