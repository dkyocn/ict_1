package com.practice2.model.entity;

public class Circle extends Point {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public void draw() {
		System.out.println("[Circle]");
		System.out.printf("X 좌표: %d, Y 좌표: %d,면적: %.1f, 둘레: %.1f\n", super.x, super.y,
			(float)(Math.PI * radius * radius), (float)Math.PI * radius * 2);
	}
}
