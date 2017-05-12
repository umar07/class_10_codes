package classes;
import java.util.*;
public class p419g3 
{
	int num,f,rev;
	p419g3(int n)
	{
		num=n;
		f=rev=0;
	}
	int prime()
	{
		int i,c=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				c++;
		}
		if(c==2)
			f=1;
		return(f);
	}
	int reverse()
	{
		int r,copy=num;
		while(copy>0)
		{
			r=copy%10;
			rev=rev*10+r;
			copy=copy/10;
		}
		if(copy==num)
			f=1;
		return(f);
	}
	void display()
	{
		int x=prime();
		int y=reverse();
		if(x==1&&y==1)
			System.out.println("prime palin");
		else
			System.out.println("not prime palin");
	}
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int n1=sc.nextInt();
		p419g3 ob=new p419g3(n1);
		ob.display();
	}

}
