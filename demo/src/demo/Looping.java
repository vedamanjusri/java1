package demo;
import java.util.Scanner;

public class Looping {
		
		public static void main(String[] args) {
			
			one:for(int i= 1;i<=5;i++)
			{
				two:for(int j = 1;j<=7;j++)
				{
					three:for(int k=1;k<=3;k++)
					{
						if(k==2)
							break one;
					System.out.print("veda");
					
					}
					
					System.out.print("  ");
				}
				System.out.println();
			}
			
			
			
			// jumping statements... break continue
//			lbl:for(int i= 1;i<=5;i++)
//			{
//				int j=1;
//				abc:while(j<=7)
//				{
//					if(j==4)
//						break lbl;
//					System.out.print("@ ");
//					j++;
//				}
//				
////				for(int j =1;j<=7;j++)
////				{
////					System.out.print("@ ");
////				}
//				System.out.println();
//			}
			
			
//			int i=1;
//			do
//			{
//				System.out.println(i);
//				i++;
//			}while(i<=5);
			
			
//			int i =1;
//			while(i<=5)
//			{
//				System.out.println(i);
//				i++;
//			}
			
//			for(int i=65;i<=90;i++)
//			{
//				System.out.println((char)i);
//			}
			
			
//			for(char i ='A';i<='Z';i++)
//			{
//				System.out.println(i);
//			}
			
			
//			char ch ='A'; // 65
//			for(int i=1;i<=26;i++)
//			{
//				System.out.println(ch);
//				ch++;
		}
	}


