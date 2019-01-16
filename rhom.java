import java.util.*;
class rhom {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value ");
        int n = input.nextInt();
        int r = 1;
        int r2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++) 
        {
            for (int spc = n - r2; spc > 0; spc--)   
           
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                r2++;
            } 
            else 
            {
                r2--;
            }
            for (int j = 0; j < r; j++) 
            {
                System.out.print(c);
                if (j < r / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < n)
            {
                r = r + 2;
            } 
            else
            {
                r = r - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}