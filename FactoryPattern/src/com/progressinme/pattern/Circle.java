package com.progressinme.pattern;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle Class");
		Double hitungLuas = 3.14 * 10 * 10;
		Integer luas = hitungLuas.intValue();
		System.out.println("Luas Lingkaran adalah " + luas);
	}

}
