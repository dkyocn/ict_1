package inherit.polymorphism.model;

//public class circle extends Shape {
public class circle implements IShape {

	double radius;

	public circle() {
		super();
	}

	public circle(double radius) {
		super();
		this.radius = radius;
	}

	// Getter & Setter

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * (this.radius * this.radius);
	}

	@Override
	public double perimeter() {
		return Math.PI * (this.radius * 2);
	}

}
