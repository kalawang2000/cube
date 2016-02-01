import java.util.Scanner;


public class cube 
{

    public static void main(String[] args) 
    {
        int num1,operator;
		double a;
     


        Scanner input = new Scanner(System.in);

        System.out.print("please enter a number ");
        num1 = input.nextInt();


        

        System.out.print("Please enter [3] if cube or [2] if square root " );
        operator = input.nextInt();
	

   if (operator==2)   
   {
		a=( Math.sqrt(num1));
	    System.out.println("the square of " + (num1) +" = "+ a);
   }
   if (operator==3)
   {
		a=(Math.cbrt(num1));
		System.out.println("the cube of " + (num1) +" = "+ a);
   }
		
   


    }
}