public class FiveDigit
{
	
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
	
		int num;	// user input
		
		System.out.print("Enter a number with five digits: ");	
		num = input.nextInt();	
		if ( (num >= 10000) && (num <= 99999) )
		{
		System.out.print((num / 10000));
		System.out.print((num / 1000) % 10);
		System.out.print((num / 100) % 10);
		System.out.print((num % 100) / 10);
		System.out.print((num % 10));
		}
		
		// if entered number more than five digits
		if (num > 99999)
			System.out.println("You had entered a number more than five digits.");
		
		// if entered number less than five digits
		if (num <= 9999)
			System.out.println("You had entered a number less than five digits.");


	} 
} 
