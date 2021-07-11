package section5;

import java.util.Scanner;

public class cinputThenPrintSumAndAverage {
	
	public static void inputThenPrintSumAndAverage() {
		Scanner input=new Scanner(System.in);
		int sum=0,avg=0;
		int count=0;
		while(true) {
			boolean isInt=input.hasNextInt();
			
			if(isInt) {
				int i=input.nextInt();
				sum+=i;
				count++;
				
			}
			else {
				avg=(int)Math.round((double)sum/count);
				System.out.println("SUM = "+sum+" AVG = "+avg);
				break;
			}
			 input.nextLine();
			
			
		}
		
		input.close();
	}
public static void main(String[] args) {
	inputThenPrintSumAndAverage();
}
}
