package array;
import java.util.*;
public class p260g4eg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,e,x=0,mid,lb=0,ub=9;
		int m[]=new int[10];
		System.out.println("Enter the numbers:");
		for(i=0;i<10;i++)
			m[i]=sc.nextInt();
		System.out.println("Enter number to be searched:");
		e=sc.nextInt();
		while(lb<=ub)
		{
			mid=(lb+ub)/2;
			if(m[mid]>e)
				ub=mid-1;
			if(m[mid]<e)
				lb=mid+1;
			if(m[mid]==e)
			{
				x=1;
				break;
			}
		}
		if(x==1)
			System.out.println("Search successful");
		else
			System.out.println("Search unsuccessful");


	}

}
