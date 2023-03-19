package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.print("Enter Array Elements: ");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.print("Reversed Array are: ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		scanner.close();
//mustakim cpomment
	}
}
