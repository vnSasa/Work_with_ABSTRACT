package ua.yaremechko.abstracts.figure;

public class RectangleAndTriangle extends Figure {

	private int y;
	private int z;

	public RectangleAndTriangle(int x, int y) {
		super(x);
		this.y = y;
		System.out.println("The area of the rectangle is = " + x * y);
	}

	public RectangleAndTriangle(int x, int y, int z) {
		super(x);
		this.y = y;
		this.z = z;
		System.out.println("The perimeter of the triangle is = " + (x + y + z));
	}

}
