package section8;

import java.util.Scanner;

public class sortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array elements (integers)");
		int[] ar = getIntegers(5);
		System.out.println("The array elements Before sorting");
		printArray(ar);
		sortIntegers(ar);
		System.out.println("The array elements After sorting");
		printArray(ar);
	}

	public static int[] getIntegers(int n) {
		int[] ares = new int[n];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < ares.length; i++) {
			boolean isInt = in.hasNextInt();
			if (isInt) {
				ares[i] = in.nextInt();
			} else {
				System.out.println("Not in integer, re enter!");
				i--;
			}
			in.nextLine();
		}
		return ares;
	}

	public static int[] sortIntegers(int[] ar) {
		// int[]ares=new int[ar.length];
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				int tmp;
				if (ar[i] < ar[j]) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		return ar;
	}

	public static void printArray(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			System.out.println("Element " + i + " contents " + ar[i]);

		}
	}
}
