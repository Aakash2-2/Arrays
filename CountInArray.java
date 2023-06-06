package array;

import java.util.Scanner;

public class CountInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of an array: ");
		
		int a []= new int[sc.nextInt()];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a value for "+i+" block");
			a[i] = sc.nextInt();
		}
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				count++;
			}
		}
		System.out.println("The array count is: "+count);
	}

}
