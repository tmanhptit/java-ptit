package J04_OBJECT;

import java.util.Scanner;

public class J04001 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			Point x = new Point(a, b);
			Point y = new Point(c, d);
			Point z;
			System.out.printf("%.4f\n",x.distance(y));
		}
	}

}

class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {

	}

	public Point() {

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distance(Point p2) {
		return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
	}

	public double distance(Point p1, Point p2) {
		return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
