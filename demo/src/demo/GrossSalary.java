package demo;
import java.util.Scanner;
public class GrossSalary {
	public static void main(String[] args) {
			
			//int [] a =new int[];
			Scanner sc = new Scanner(System.in);
			
			Employee []emp = new Employee[5]; // 5
			
			
			for(int i =0;i<5;i++)
			{
				emp[i]=new Employee();
				
				System.out.println("Enter your id");
				emp[i].setId(sc.nextInt());
				sc.nextLine();
				
				
				System.out.println("Enter your name");
				emp[i].setName(sc.nextLine());
				
				System.out.println("Enter your basic salary");
				emp[i].setBasic_sal(sc.nextInt());
				sc.nextLine();
				
			}
			
			
			for(int i =0;i<5;i++)
			{
				System.out.println(emp[i].cal_gross_sal());
			
			}
		}
			
	}
	class Employee
	{
		
		private int id;
		private	String name;
		private	int basic_sal;
		private double gross_sal;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBasic_sal() {
			return basic_sal;
		}
		public void setBasic_sal(int basic_sal) {
			this.basic_sal = basic_sal;
		}
		
		public double cal_gross_sal()
		{
			gross_sal = (basic_sal*0.13) + (basic_sal*0.1)+(basic_sal *0.12)+basic_sal;
			return gross_sal;
		}
		

}
