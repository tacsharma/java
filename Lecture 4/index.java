import java.util.*;
class index
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i,j,n;j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of array");
		for(i=0;i<10;i++)
		{
            a[i]=sc.nextInt();
		}
        System.out.println("enter number u want to find");
        n=sc.nextInt();
        for(i=0;i<10;i++)
        {
        	if(a[i]==n)
        	{
        		j=1;
        	    break;
        	}
        	    else
        	    	j=0;
        }
        if(j==0)
        	System.out.println("not present");
        else
        	System.out.println("present");
	}
}

