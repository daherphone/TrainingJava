package Section4;

public class challange1 {
	private static final double PI = Math.PI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(-1));
		System.out.println(area(5));
	}

	public static double area(double radius) {
		return radius<0?-1.0:PI*Math.pow(radius, 2);
	}
	public static double area(double x,double y) {
		return (x<0 || y<0)?-1.0:x*y;
	}
}
