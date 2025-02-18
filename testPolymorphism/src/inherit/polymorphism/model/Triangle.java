package inherit.polymorphism.model;

public class Triangle implements IShape {

	private double base;
	private double height;

	public Triangle() {
		super();
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return (this.base * this.height) / 2;
	}

	@Override
	public double perimeter() {
		return getHypotenuse() + this.base + this.height;
	}

	public double getHypotenuse() {
		return Math.sqrt((this.base * this.base) + (this.height * this.height));
	}

}
