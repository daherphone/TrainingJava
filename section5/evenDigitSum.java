package section5;

public class evenDigitSum {
	public static int  getEvenDigitSum(int number) {
		int sum=0;
		if(number<0)return -1;
		while(number!=0) {
			if((number%10)%2==0)sum+=number%10;
			number/=10;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println(getEvenDigitSum(1234));
		try {
			System.out.println(Integer.parseInt("1213.6"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not an Integer");
		}
		
		try {
			System.out.println(Double.parseDouble("1213.6"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not an Integer");
		}
	}

}
