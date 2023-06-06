package array;

import java.util.Scanner;

public class CountOdd {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter size for arrays: ");
		int a[] = new int[sc.nextInt()];
			
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter a value for "+(i+1)+" block");
			a[i] = sc.nextInt();
		}
		int count = 0;		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				count++;
			}
		}
		System.out.println("Count of odd number of given array: "+count);
	}
}