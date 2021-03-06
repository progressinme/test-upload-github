package com.progressinme.pattern;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape shape1 = sf.getShape("Circle");
		shape1.draw();
		Shape shape2 = sf.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = sf.getShape("Triangle");
		shape3.draw();
	}

}
