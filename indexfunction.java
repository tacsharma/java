import java.io.*;
class indexfunction
{
int a[]=new int[10];
	public void index(int x)
	{
		int i,j,k;j=0;
		
		for(k=0;k<10;k++)
        {
        	if(a[k]==x)
        	{
        		j=1;
        	    break;
        	}
        	    else
        	    	j=0;
        }
        if(j==1)
        	System.out.println(" present");
        else
        	System.out.println(" not present");
	}
	
	public static void main(String args[])throws IOException
	{
		
		int i,n;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int a[]=new int[10];
		System.out.println("enter elements of array");
		for(i=0;i<10;i++)
		{
            a[i]=Integer.parseInt(in.readLine());
		}
        System.out.println("enter number u want to find");
        n=Integer.parseInt(in.readLine());
        indexfunction ob=new indexfunction();
        ob.index(n);
        }
}

