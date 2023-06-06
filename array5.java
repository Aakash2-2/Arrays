package array;

import java.util.Scanner;

public class array5 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of an arrays: ");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value in "+i+" block");
			a[i]= sc.nextInt();
		}
		System.out.print("{");
		
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.print("}");
	}
}