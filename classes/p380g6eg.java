package classes;
import java.util.*;
public class p380g6eg {

	String s;
	int t1,t2;
	void input(String st)
	{
		s=st;
		t1=0;
		t2=0;
	}
	void countwords()
	{
		int l,i;
		char ch;
		l=s.length();
		s=" "+s;
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
			{
				if(Character.isUpperCase(s.charAt(i+1))==true)
					t1++;
				if(Character.isLowerCase(s.charAt(i+1))==true)
					t2++;
			}
		}
	}
	void display()
	{
		System.out.println("Input string:"+s);
		System.out.println("Number of words starting with Upper case:"+t1);
		System.out.println("Number of words starting with Lower case:"+t2);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		 String st1=sc.nextLine();
		p380g6eg ob=new p380g6eg();
		ob.input(st1);
		ob.countwords();
		ob.display();
	}
}
