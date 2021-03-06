package com.progressinme.pattern;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if (shape == "") {
			return null;
		} else if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		return null;
	}
}
