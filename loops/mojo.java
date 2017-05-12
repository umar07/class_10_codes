package loops;

public class mojo {

	public static void main(String[] args) 
	{
		int i,j,b,p=0;
		for(i=5;i>=1;i--)
		{
			for(b=0;b<=p;b++)         
			{                                        
				System.out.print(" ");                
			}                                            
			for(j=i;j>=1;j--)                          
			{
				System.out.print(j);
			}
			System.out.println();
			p++;

		} /*question is     54321
		                     4321 
		                      321
		                       21
		                        1   */ 

	}
	

}
