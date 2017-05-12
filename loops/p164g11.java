package loops;

public class p164g11 {

	public static void main(String[] args) 
	{
		int i,c,a=0,b=1,n=55,x=0;
		for(i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			if(c==n)
				x++;//only one time x will increment as it will match only one time..else x=0
		}
		if(x==1)
			System.out.println("present");//same thing over here....
		else
			System.out.println("not present");
		//maza aa gaya!!!   :):):)
	}

}
