import java.util.*;
class alp
{
	public static void main(String[ ] arg)
	{
	Scanner input =new Scanner(System.in);
	System.out.print("Enter a character : ");
	char ch=input.next( ).charAt(0);	 		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character "+ch+" is a vowel."); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is a consonant.");
	      else
		System.out.println("Not an alphabet");		
	}
}
