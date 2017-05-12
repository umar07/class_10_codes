package array;
import java.util.*;
public class p265g9eg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,c=0,len;
		char ch;
		String str,str1="";
		String nw[]=new String[10];
		System.out.println("Enter your string");
		str=sc.nextLine();
		str=str+" ";
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				nw[c]=str1;
				c++;
				str1="";
			}
			else
				str1=str1+ch;
			
		}
		System.out.println("reversed order:");
		for(i=c-1;i>=0;i--)
			System.out.print(nw[i]+" ");

	}

}
