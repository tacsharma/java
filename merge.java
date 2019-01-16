import java.io.*;
class merge
{

	public static void main(String args[])throws IOException
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		int i,j,temp,temp1,x=0;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		
		System.out.println("enter elements of   array");
		for(i=0;i<5;i++)
		{
		 a[i]=Integer.parseInt(in.readLine());
		 
		}
		System.out.println("enter elements of   array");
		for(i=0;i<5;i++)
		{
			b[i]=Integer.parseInt(in.readLine());
		}
		
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]<=a[j])
				{
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
				}

			}
		}
        for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(b[i]<=b[j])
				{
                   temp1=b[i];
                   b[i]=b[j];
                   b[j]=temp1;
				}

			}
		}
		for(i=0;i<5;i++)
		{
              c[x]=a[i];
              x++;
		}
		for(i=0;i<5;i++)
		{
		     c[x]=b[i];
		     x++;
		}
		for(i=0;i<x;i++)
		{
		System.out.print(c[i]+" ");
        }
    }
}

