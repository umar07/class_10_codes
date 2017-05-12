package array;
import java.util.*;
public class p280g7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String coun[]=new String[5];
		String cap[]=new String[5];
		int i;
		for(i=0;i<5;i++)
		{	
			System.out.println("Enter country name:");
			coun[i]=sc.nextLine();
			System.out.println("Enter its capital:");
			cap[i]=sc.nextLine();
		}
		System.out.println("Country Name\t\tCapital");
		for(i=0;i<5;i++)
			System.out.println(coun[i]+"\t\t\t"+cap[i]);
	}
	

}
