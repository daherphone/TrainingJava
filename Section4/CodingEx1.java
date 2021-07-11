package Section4;

public class CodingEx1 {
	public static long toMilesPerHour(double kilometersPerHour){
        long res=0;
        
        if(kilometersPerHour<0) res=-1;
        else res=Math.round(kilometersPerHour/1.609);
        return res;
    }
	public static void printConversion (double kilometersPerHour) {
	if(kilometersPerHour<0)System.out.println("Invalid Value");
	else 
		System.out.println(kilometersPerHour+ " km/h = "+ Math.round(kilometersPerHour/1.609)+" mi/h");
	}
public static void main(String [] args) {
	
	System.out.println(toMilesPerHour(1.5));
	System.out.println(toMilesPerHour(10.25));
	System.out.println(toMilesPerHour(-5.6));
	printConversion(1.5);
	
}
}
