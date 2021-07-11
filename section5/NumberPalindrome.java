package section5;

public class NumberPalindrome {

	public static boolean  isPalindrome(int number)	 {
		
		int rev=0;
		int n=number;
		while(number!=0) {
			int rem=number%10;
			rev=rev*10+rem;
			number/=10;
		}
		System.out.println(rev);
		return rev==n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
	System.out.println(isPalindrome(-1221));
	}

}
