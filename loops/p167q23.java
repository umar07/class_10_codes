package loops;
import java.util.*;
public class p167q23 {

	public static void main(String[] args)
	{
		int age,i,c=0,x=0,y=0,z=0;
		Scanner sc=new Scanner(System.in);
		
		for(i=1;;i++)//infinite loop
		{
			System.out.println("enter age" +" (enter age 0 to terminate)");
			age=sc.nextInt();
			if(age==0)
				break;
			else if(age>=18)
			{
				//c=c+5;
				x++;
			}
			else if(age>=5 && age<18)
			{
				//c=c+3;
				y++;
			}
			else 
				z++;
		}
		System.out.println("persons above 18="+x);
		System.out.println("persons between 5 & 18="+y);
		System.out.println("kids below 5="+z);
		System.out.println("total collection in all="+(x*5+y*3));//all="+c;
		//can be done both ways with c,without c.
		//most interesting till now!! :):):)(:
		

	}

}
