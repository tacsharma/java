class rel 
{
    public static void main(String[] args) 
    {
        int a = 15;
        int b = 25;
        int value1,value2;
        boolean result = a == b;
 
        System.out.println("a == b? " + result);
 
        result = a != b;
 
        System.out.println("a != b? " + result);
 
        result = a > b;
 
        System.out.println("a > b? " + result);
 
        result = a >= b;
 
        System.out.println("a >= b? " + result);
 
        result = a < b;
 
        System.out.println("a < b? " + result);
 
        result = a <= b;
 
        System.out.println("a <= b? " + result);
        
        if ((a > 7) && (b > 7)) {
            System.out.println("Both a and b are greater than 7.");
        }
 
        if ((a > 10) || (b > 10)) {
            System.out.println("Either a or b is greater than 10.");
            
        value1 = (a > 10) ? a : b;
 
        System.out.println("value 1 is: " + value1);
 
        value2 = (b > 10) ? b : a;
        System.out.println("value 2 is: " + value2);
                    
    }
}
}
