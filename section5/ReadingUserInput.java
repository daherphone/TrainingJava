package section5;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int nbr,count=1;
		while(count<=10) {
			System.out.println("Enter number #"+count);
			if(input.hasNextInt()) {
				nbr=input.nextInt();
				input.nextLine();
				count++;
				}
			else {input.nextLine();
			System.out.println("Unable to Parse number ");}
			}
		input.close();
		System.out.println("End of program.");}
		
		
	}


