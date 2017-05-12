package array;

import java.util.*;//not working might prove useful for you ,no problem in compilation
class stringbubblesort
{
  public static void main(String[]args)
   {  Scanner sc = new Scanner(System.in);
      int i,j=0,p,n,dif;
      String str1="",str,t;
      char chr;
      System.out.println("Enter the number of words present in your string:");
      /*taking the input
        for the number of words
        which would act as the size 
        of the array*/
      n=sc.nextInt();                                                          
      System.out.println("Enter your string");                                  
      str=sc.nextLine();                                                        
      String arr[]=new String[n]; 
       p=str.length();
       //loop which would put the words of the sentence int he form of elements of array arr
       for(i=0;i<p;i++)
       {chr=str.charAt(i);
        if(chr!=' ')
        str1=str1+chr;
        else
        {arr[j]=str1;
         j=j+1;
         str1="";
        }
       }
      arr[n-1]=str1;//this statement stores the last element of array arr
      for(i=0;i<n-1;i++)//loop for bubble sort
      {for(j=0;j<(9-(n-1));j++)
         { //dif=arr[j].compareTo(arr[j+1]);//problem is here "null pointer exception
         if(arr[j].compareTo(arr[j+1])>0)
          {t=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=t;
          }
        } 
       }
       System.out.println("The words arranged in ascending order are:");
       for(i=0;i<n;i++)
        System.out.print(arr[i]);
    }
}
