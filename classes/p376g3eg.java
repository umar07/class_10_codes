package classes;
import java.util.*;
public class p376g3eg {

	String name;
	int age;
	double basic;
	void getdata(String n,int a,double b)
	{
		name=n;
		age=a;
		basic=b;
	}
	void calculate()
	{
		double inc=0.0;
		if(age>=56)
			inc=basic*20.0/100.0;
		if(age<56&&age>45)
			inc=basic*15.0/100.0;
		if(age<=45)
			inc=basic*10.0/100.0;
		basic=basic+inc;
	}
	void display()
	{
		System.out.println("Name\t\tAge\t\tUpdated Basic");
		System.out.println(name+"\t"+age+"\t\t"+basic);
	}
	 public static void main(String[] args) 
	{
		p376g3eg ob=new p376g3eg();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name,age and basic salary:");
		String n1=sc.nextLine();
		int a1=sc.nextInt();
		double b1=sc.nextDouble();
		ob.getdata(n1, a1, b1);
		ob.calculate();
		ob.display();
	}

}
