package array;

import java.util.Scanner;

public class CountOfSumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  array size: ");
		
		int []a = new int [sc.nextInt()];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter value for "+(i+1)+" block"); 
			//0 block look very unnatural from customers POV so i put +1 in with i
			a[i] = sc.nextInt();
		}
		
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				count++;
				sum = sum + a[i];
			}
		}
		System.out.println("The count of number is: "+count+" and "+"sum of number is: "+sum);
	}
}