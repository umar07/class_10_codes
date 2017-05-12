package loops;

public class p165g17f {

	public static void main(String[] args) 
	{
		int f=1,s=0,i,j;
		//i<10 can also be..but no i<=10 cuz then 10 is added 
	    //and factorial is done of 11.
		//series became as--  1+2!+2+3!+3+4!+4....+9+10!
		for(i=1;i<=9;i++)
		{
			for(j=i+1;j>=1;j--)
				f=f*j;
					
			/*if(j>=1)
			{
				f=f*j;
				j--;
			}
			else
				break;*///how with it the code could run ??in comments
			s=s+(i+f);
			System.out.println(s);
			f=1;
		}
		
		//incomplete...took more than 1 hr still not done.
		//another day did it yess..

	}

}
