package Section4;

public class MethOverload {
	
	public static double calcFeetAndInchToCentimeters (double feet, double inches) {
		if(feet<0 ||inches<0 || inches>12)return -1;
		double cent= (inches*2.54) + (feet*12*2.54);
		return cent;	
	}	public static double calcFeetAndInchToCentimeters (double inches) {
		if(inches<0 )return -1;
		
		return inches/12.0;	
	}
	public static void main(String[] args) {
	
}
}
