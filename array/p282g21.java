package array;
import java.util.*;
public class p282g21 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int sum[]=new int[5];
		int s1[]=new int[5];
		int s2[]=new int[5];
		int s3[]=new int[5];
		double avg[]=new double[5];
		for(i=0;i<5;i++)
		{	
			System.out.println("Roll No-"+(i+1));
			System.out.print("Enter marks in Subject A:");
			s1[i]=sc.nextInt();
			System.out.print("Enter marks in Subject B:");
			s2[i]=sc.nextInt();
			System.out.print("Enter marks in Subject C:");
			s3[i]=sc.nextInt();
			
		}
		for(i=0;i<5;i++)
			sum[i]=s1[i]+s2[i]+s3[i];
		for(i=0;i<5;i++)
			avg[i]=sum[i]/3;
		for(i=0;i<5;i++)
			System.out.println("Average marks of:\tRoll No."+(i+1)+"="+avg[i]);		
		System.out.println();
		System.out.println("List of children with above 80 average:");
		for(i=0;i<5;i++)
		{
			if(avg[i]>=80.0)
				System.out.println("Roll No."+(i+1)+"\tMarks obtained="+avg[i]);
		}
		System.out.println();
		System.out.println("List of children with below 80 average:");
		for(i=0;i<5;i++)
		{
			if(avg[i]<80.0)
				System.out.println("Roll No-"+(i+1)+"\tMarks obtained="+avg[i]);
		}
		
			
		
	}

}
