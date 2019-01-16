import java.io.*;
class duplicate
{

	public static void main(String args[])throws IOException
	{
		int b[]=new int[5];
		int i,j,n=0;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int a[]=new int[10];
		System.out.println("enter elements of array b/w 10 &100");
		for(i=0;i<5;i++)
		{
		 a[i]=Integer.parseInt(in.readLine());
		 if((a[i]<10)||(a[i]>100))
		 {
		  System.out.println("re-enter the number");
		  a[i]=Integer.parseInt(in.readLine());
		}
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i!=j)
				{
                if(a[i]!=a[j])
                 n=1;
                else
                	{
                		n=0;
                		break;
                	}
                }
            }
            if(n==1)
            	System.out.print(a[i]+" ");
		}
        
        }
}

