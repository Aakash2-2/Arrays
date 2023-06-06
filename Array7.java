package array;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		
		int a []= new int [sc.nextInt()];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value for arrays: "+i+" block");
			a[i] =sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				System.out.print(a[i]+ " ");
			}
		}
	}
}