package Chapter07;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}

public class Ex07_04 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x=" + p.x + " y =" + p.y + " z =" + p.z);
	}
}
