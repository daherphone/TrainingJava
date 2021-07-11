package section7;

public class Cuboid extends Rectangle{
	private double height;

	public Cuboid(double width, double length,double height) {
		super(width, length);
		this.height=height<0?0:height;
		// TODO Auto-generated constructor stub
	}

	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return height*super.getArea();
	}

}
