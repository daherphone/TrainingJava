package Section4;

public class ChallengePrintEqual {
public static void main(String[] args) {
	printEqual(1, 2, 3);
	}
	public static void printEqual(int a, int b, int c) {
	
		String s1="Invalid Value",s2="All numbers are equal"
				,s3="Neither all are equal or different",s4="All numbers are different";
		
		if(a<0||b<0||c<0)System.out.println(s1);
		else
			if(a==b && b==c)System.out.println(s2);
			else if(a!=b && b!=c && a!=c)System.out.println(s4);
			else System.out.println(s3);
	}
 
}
