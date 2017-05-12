package array;

public class p280g1 {

	public static void main(String[] args) 
	{
		int m[]={23,31,44,56,72,55},i;
		double sum=0.0,avg;
		for(i=0;i<6;i++)
			sum=sum+m[i];
		avg=sum/6;
		System.out.println(sum);
		System.out.println(avg);

	}

}
