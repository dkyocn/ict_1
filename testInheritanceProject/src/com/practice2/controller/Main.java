package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {

		Circle[] circles = {new Circle(3, 2, 5), new Circle(1, 3, 6), new Circle(4, 2, 7)};
		Rectangle[] rectangles = {new Rectangle(2, 4, 5, 6), new Rectangle(5, 2, 1, 5), new Rectangle(7, 3, 7, 5)};

		for (int i = 0; i < circles.length; i++) {
			circles[i].draw();
			rectangles[i].draw();
		}

		Point[] points = new Point[5];

		points[0] = new Circle();

		for (int i = 0; i < points.length; i++) {

		}
	}

}
