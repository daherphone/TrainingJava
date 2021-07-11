package Section4;

public class MegaBytesConverter {
	
	
	public static boolean hasTeen(int a1, int a2, int a3) {
		boolean b1,b2,b3;
		b1=(a1>=13 && a1<=19)?true:false;
		b2=(a2>=13 && a2<=19)?true:false;
		b3=(a3>=13 && a3<=19)?true:false;
		return b1||b2||b3;
		
	}
	/*	public static boolean isTeen(int a1) {
		boolean b1;
		b1=(a1>=13 && a1<=19)?true:false;
		
		return b1;
		
	}*/
public static boolean isTeen(int a1) {
		
		
		return hasTeen(a1,10,10);
		
	}
	
	public static boolean hasEqualSum(int a,int b, int c) {
		
		return a+b==c?true:false;
	}
	public static boolean areEqualByThreeDecimalPlaces (double d1, double d2) {
		boolean res=false;
		//if(Math.round(d1*1000)==Math.round(d2*1000))
		if((int)(d1*1000)==(int)(d2*1000))res=true;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printMegaBytesAndKiloBytes(5000);
		/*System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(!true, 2));
		System.out.println(shouldWakeUp(true, 8));
		System.out.println(shouldWakeUp(true, -1));
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));*/
		System.out.println(hasTeen(9, 99, 19)+"\n"
		+hasTeen(23, 15, 42)+"\n"
		+hasTeen(22, 23, 34));
		System.out.println( isTeen(9)+"\n"
				+ isTeen(13));
		

		//		 * isTeen(13);  should return true since 13 is in range 13 - 19
		
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
	int YY,ZZ;
	if(kiloBytes<0)System.out.println("Invalid Value");
	else {
	YY= kiloBytes / 1024;
	ZZ= kiloBytes % 1024;
	System.out.println(kiloBytes +" KB = "+ YY + " MB and "+ZZ+" KB");
	}
	}

	public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
		boolean res=true;
		if(barking==false)res=false;
		else
			if(hourOfDay<0 ||hourOfDay>23)res= false;
		else
			if(hourOfDay>=8 &&hourOfDay<=22)res=false;
		return res;
	}
	
	public static boolean isLeapYear(int year) {
		boolean res;
		if(year<1 || year >9999)return false;
		if(year%4 == 0) {
			if(year%100 ==0) {
				if(year%400 ==0) {
					res=true;
				}
				else res=false;
			}
			else res=true;
		}
		else res = false;
		return res;
			}
	
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
}
