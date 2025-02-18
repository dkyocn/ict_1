package inherit.polymorphism.model;

//public class Rectangle extends Shape {
public class Rectangle implements IShape {

	double width;
	double heigh;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double heigh) {
		super();
		this.width = width;
		this.heigh = heigh;
	}

	// Getter & Setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigh() {
		return heigh;
	}

	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}

	@Override
	public double area() {
		return this.width * this.heigh;
	}

	@Override
	public double perimeter() {
		return 2 * (this.heigh + this.width);
	}

}
