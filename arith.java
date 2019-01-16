class arith
{
 
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 5;
 
        int sum = num1 + num2;
 
        
        int difference = num1 - num2;
 
        
        int product = num1 * num2;
 
        
        int quot = num1 / num2;
 
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("sum: "+sum);
        System.out.println("difference: "+difference);
        System.out.println("product: "+product);
        System.out.println("quot: "+quot);
        if (num1<0){
            num1  =0-num1 ;
        }

        if(num2<0){
            num2 = 0-num2;
        }
        System.out.println("mod of num1 : "+num1);
        System.out.println("mod of num2 : "+num2);

        }
       
    }
