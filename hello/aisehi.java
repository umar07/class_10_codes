package hello; 
import java.util.*;
class aisehi
{public static void main (String[]args)
{int i,j,n;
char chr,t,m[];
Scanner sc =new Scanner (System.in);
System.out.println("Enter the number of elements:");
n= sc.nextInt();
m=new char[n];
String a[]=new String[n];
System.out.println("Enter the WORDS:");
for(i=0;i<n;i++)
a[i]=sc.next();
for(i=0;i<n;i++)
{chr=a[i].charAt(0);
 //for(j=0;j<n;j++) NOT NEEDED
 m[i]=chr;//DIRECT WITH i 
}
for(i=0;i<n-1;i++)
{for(j=0;j<n-1-i;j++)
	//(int)Character.toUpperCase(m[j])>(int)Character.toUpperCase(m[j+1])
	//CHARACTERS TOO CAN BE COMPARED JUST NUMBERS!!
	//IF WANT CASE CHANGE THEN DO IT AT THE VERY PLACE WHERE m[i]IS ENTERED.
    {if(m[j]>m[j+1])
        {t=m[j];
         m[j]=m[j+1];
         m[j+1]=t;
       }
   }
}
for(i=0;i<n;i++)
System.out.print(m[i]);
}
}

