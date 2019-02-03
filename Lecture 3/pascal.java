import java.util.Scanner;
class pascal
{
    public static void main(String args[])
	{
	    int r, i, k, n=1, j;
	    char x='y';
		Scanner scan = new Scanner(System.in);
		do{
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");
			}
            n = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(n+ " ");
                 n = n * (i - j) / (j + 1);
			}
			System.out.println("Do you want to continue?");
			x= scan.next().charAt(0);
		}
	}while(x=='Y'|| x=='y');
}
}
