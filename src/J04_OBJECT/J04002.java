package J04_OBJECT;

import java.util.Scanner;

public class J04002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String col = sc.next();
        if(a*b<=0||a+b<=0) {
        	System.out.println("INVALID");
        }else {
		conmemay dume = new conmemay(a, b, col);
		System.out.println(dume.finPerimeter() + " " + dume.findArea() + " " + dume.getColor());
        }
	}
}

class conmemay {
	private int width;
	private int height;
	private String color;

	public conmemay(int width, int height, String color) {
		// super();
		this.width = width;
		this.height = height;
		int n = color.length();
		color = color.substring(0, 1).toUpperCase() + color.substring(1, n ).toLowerCase();

		this.color = color;
	}

	public conmemay() {

		this.height = 1;
		this.width = 1;
		this.color = null;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public int findArea() {
		return this.height * this.width;
	}

	public int finPerimeter() {
		return (this.height + this.width) * 2;
	}
}