package strings;
import java.util.*;
public class mamquest 
{
	void manip(String str,int p)
	{
		int len=str.length(),i;
		char ch;
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(p%2==0)
			{	
				if(i%2==0)
				System.out.print(ch);
			}
			else
			{
				if(i%2!=0)
					System.out.print(ch);
			}
		}
	}
	void manip(int a,char ch)
	{
		double y;
		if(ch=='s')
			y=Math.sqrt(a);
		else
			y=Math.pow(a,(1.0/3.0));
		System.out.println(y);
	}
	public static void main(String [] args)
	{
		String s;
		int w,z,n;
		char ch1;
		mamquest obj=new mamquest();
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for even/odd position of characters\n2 for sq/croot");
		n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("enter ur string and a no.");
			s=sc.nextLine();
			w=sc.nextInt();//y mismatch??????????
			obj.manip(s,w);
			break;
		case 2:
			System.out.println("enter a no. &'s' for squareroot else cuberoot");
			z=sc.nextInt();
			ch1=sc.next().charAt(0);			
			obj.manip(z,ch1);
			break;
			default:
				System.out.println("theek se dalo ");

		}
		
		
			}
	
}
