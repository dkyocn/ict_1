package oop.controller;

import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;
import inherit.polymorphism.model.circle;

public class TestPolyPractice3 {

	public static void main(String[] args) {

		IShape[] iShapes = new IShape[5];

		iShapes[0] = new circle(24.2);
		iShapes[1] = new Triangle(24.2, 13.5);
		iShapes[2] = new Rectangle(14.4, 23.1);
		iShapes[3] = new circle(24.2);
		iShapes[4] = new Triangle(3.5, 12.1);

		for (int i = 0; i < iShapes.length; i++) {

			System.out.println("[둘레와 면적]");
			System.out.printf("둘레: %.2f\n", iShapes[i].perimeter());
			System.out.printf("면적: %.2f\n", iShapes[i].area());
			if (iShapes[i] instanceof Triangle) {
				Triangle triangle = (Triangle)iShapes[i];
				System.out.printf("빗변: %.2f\n", triangle.getHypotenuse());
			}

		}
	}

}
