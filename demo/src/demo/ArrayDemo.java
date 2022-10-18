package demo;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length: ");
		int num=sc.nextInt();
		int [] arr = new int[num];
		System.out.println("Enter any " + arr.length + " numbers");
		for (int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]*arr[i]);
			
		}

	}

}
