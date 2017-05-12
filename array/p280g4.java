package array;
import java.util.*;
public class p280g4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int r[]=new int[11];//11 already known	
		String str[]=new String[11];
		int i,max=0;
		String st="";
		for(i=0;i<11;i++)
		{
			System.out.println("name");
			str[i]=sc.next();
			System.out.println("runs");
			r[i]=sc.nextInt();
		}
		for(i=0;i<11;i++)
		{
			if(r[i]>max)
			{
				max=r[i];
				st=str[i];
			}
		}
		System.out.println("highest scorer---\n"+st+"-"+max);
	}

}
