package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.circle;

public class TestShape {

	public static void main(String[] args) {

		//		Shape shape;
		IShape shape;

		shape = new circle(15.5);
		System.out.println("원 면적: " + shape.area());
		System.out.println("원 둘레: " + shape.perimeter());

		shape = new Rectangle(34.5, 42.7);
		System.out.println("사각형 면적: " + shape.area());
		System.out.println("사각형 둘레: " + shape.perimeter());
	}

}
