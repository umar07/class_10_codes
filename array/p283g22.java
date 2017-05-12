package array;
import java.util.*;
public class p283g22 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 6 elements of first array:");
		int p[]=new int[6];
		int q[]=new int[4];
		int r[]=new int[10];
		int i,k=0;
		for(i=0;i<6;i++)
			p[i]=sc.nextInt();
		System.out.println("Enter the 4 elements of second array:");
		for(i=0;i<4;i++)
			q[i]=sc.nextInt();
		/*for(i=0;i<10;i++)
		{
			if(i<6)
			r[i]=p[i];
			else
				{
					r[i]=q[k];
					k++;
				}
		}*/
		for(i=0;i<6;i++)
			r[i]=p[i];
		for(i=0;i<4;i++)
			r[6+i]=q[i];
		System.out.println("Merged array is:");
		for(i=0;i<10;i++)
			System.out.print(r[i]+"|");
		
	}

}
