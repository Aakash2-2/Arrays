package array;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size for arrays: ");
		int a[] = new int[sc.nextInt()];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter a value for "+(i+1)+" block");
			a[i] = sc.nextInt();
		}
		System.out.print("{");		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.print(a[i]);
				if (i != a.length-1) {
					System.out.print(", ");
				}
			}
		}
		System.out.print("}");
	}
}