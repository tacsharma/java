import java.io.*;
class DDarray
{

	public static void main(String args[])throws IOException
	{
		int a[][]=new int[5][5];
		int i,j;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		
		System.out.println("enter elements of   array");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
		        a[i][j]=Integer.parseInt(in.readLine());
		        if((a[i][j]<10)||(a[i][j]>99))
		        {
		        	System.out.println("error re-enter the no.");
		        	a[i][j]=Integer.parseInt(in.readLine());
		        }
		 }
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(a[i][j]);

				}
				System.out.println();
		}
        for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i][j]%2==0)
					continue;
				else
					a[i][j]=a[i][j]*2;
			}
		}
		for(i=0;i<5;i++)
		{
              for(j=0;j<5;j++)
              {
              	System.out.print(a[i][j]+" ");
              }
              System.out.println();
        }
    }
}

