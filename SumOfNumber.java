package array;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		
		int a[]= new int[sc.nextInt()];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a value for "+i+" block");
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				sum += a[i];
			}
		}
		System.out.println("sum of positive number of an array: "+sum);
	}
}