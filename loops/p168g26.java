package loops;

public class p168g26 {

	public static void main(String[] args) 
	{
		int n,m,a=0,b=0,p1=0,p2=0,i,j;
		for(i=1;;i++)
		{
			n=(int)((Math.random())*6)+1;
			p1=p1+n;
			a++;
			if(p1>=20)
				p1=0;
			if(p1==20)
				break;
		}//y no outpt is shown???????
		for(j=1;;j++)
		{
			m=(int)((Math.random())*6)+1;
			p2=p2+m;
			b++;
			if(p2>=20)
				p2=0;
			if(p2==20)
				break;
			
		}
		if(a>b)
			System.out.println("a wins");
		else if(a==b)
			System.out.println("draw");
		else
			System.out.println("b wins");
		

	}

}
