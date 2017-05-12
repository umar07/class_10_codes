package classes;
import java.util.*;
public class p391g7 {

	int pan;
	String name;
	double taxincome;
	double tax;
	void input()
	{Scanner sc=new Scanner(System.in);
	System.out.println("Enter pan number:");
		pan=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter taxable income");
		taxincome=sc.nextDouble();
	}
	void cal()
	{
		if(taxincome<=100000)
			tax=0;
		if(taxincome>=100001&&taxincome<=150000)
			tax=10.0/100.0*(taxincome-100000);
		if(taxincome>=150001&&taxincome<=250000)
			tax=5000+20.0/100.0*(taxincome-150000);
		if(taxincome>250000)
			tax=25000+30.0/100.0*(taxincome-250000);
	}
	void display()
	{
		System.out.println("Pan Number\tName\t\tTax-Income\tTax");
		System.out.println(pan+"\t"+name+"\t\t"+taxincome+"\t"+tax);
	}
	public static void main(String[] args) 
	{
		p391g7 ob=new p391g7();
		ob.input();
		ob.cal();
		ob.display();

	}

}
