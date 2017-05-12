package array;

public class p280g5 {

	public static void main(String[] args) 
	{
		int m[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int i,even=0,odd=0;
		for(i=0;i<20;i++)
		{
			if(m[i]%2==0)
				even=even+m[i];
			else
				odd=odd+m[i];
		}
		System.out.println("even sum-"+even);
		System.out.println("odd sum-"+odd);

	}

}
