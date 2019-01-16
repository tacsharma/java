import java.util.*;
class series 
{
    public static void main(String[] args) 
    {
        double sum = 0;
        int x;
        System.out.println("1+x+x2 /2!+x3/3!+...");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:");
        x = s.nextInt();
        series obj = new series();
        for(int i = 1; i <= x; i++)
        {
            sum = sum + (double)i / (obj.fact(i));
        }
        System.out.println("Sum of series:"+sum);
    }
    int fact(int x)
    {
        int m = 1;
        while(x > 0)
        {
            m = m * x;
            x--;
        }
        return m;
    }
}
