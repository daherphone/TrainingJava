package section5;
import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;boolean isInt;
		while(true) {
			System.out.println("Enter a number: ");
			isInt=input.hasNextInt();
			if(isInt) {
				int i=input.nextInt();
				min=i<min?i:min;
				max=i>max?i:max;	
			}else {
				System.out.println("this is Not an integer!\nThe result:");
				break;
				
			}
			input.nextLine();			
		}
		System.out.println("Min is = "+min+"\nMax is = "+max);
	input.close();
	}

}
