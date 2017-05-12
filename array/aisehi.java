package array;
import java.util.*;
public class aisehi {

	public static void main(String[] args) 
	{
		//linear search
		/*Scanner sc=new Scanner(System.in);
		int n[]=new int[5];
		System.out.println("enter  no.(max ten)");
		for(int i=0;i<5;i++)
			n[i]=sc.nextInt();		
		System.out.println("enter no. to be searched");
		int src=sc.nextInt();
		int x=0,i;
		int l=n.length;
		for(i=0;i<l;i++)
		{
			if(n[i]==src)
			{
				x=1;
				break;
			}
			
		}
		if(x==1)
			System.out.println("at "+i+" index present");
		else
			System.out.println("not present");
	*/
		String str[]={"hi","ko","ht","lo"};
		String tem;
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=i+1;j<4;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					tem=str[i];
					str[i]=str[j+1];
					str[j+1]=str[i];
				}
			}
		}
		for(i=0;i<4;i++)
			System.out.println(str[i]);
	}

}
