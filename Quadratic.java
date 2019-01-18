import java.util.*;
class Quadratic {

	public static void main(String[] args) {
		int a, b, c;
        double r1, r2, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a: ");
        a = s.nextInt();
        System.out.print("Enter b: ");
        b = s.nextInt();
        System.out.print("Enter c: ");
        c = s.nextInt();
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("Roots are real and unequal");
            r1 = ( - b + Math.sqrt(d))/(2*a);
            r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Root 1 is:"+r1);
            System.out.println("Root 2 is:"+r2);
        }
        else if(d == 0)
        {
            System.out.println("Roots are real and equal.");
            r1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Root:"+r1);
        }
        else
        {
            System.out.println("Roots are imaginary.");
        }

	}

}