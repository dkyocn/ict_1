package com.practice2.model.entity;

public class Rectangle extends Point {

	private int width;
	private int height;

	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("[Rectangle]");
		System.out.printf("X 좌표: %d, Y 좌표: %d,면적: %.1f, 둘레: %.1f\n", super.x, super.y,
			(float)(width * height), (float)(2 * (width + height)));
	}
}
