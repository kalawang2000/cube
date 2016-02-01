import java.util.Scanner;
import java.util.InputMismatchException;

public class cube 
{

	
	public int enternum(int x) {	
	
	boolean bError=true, cError=true;
	int num1=0;
	Scanner in = new Scanner(System.in); 	       
		
		do {
			try {
				
				if (x==0) {
				   System.out.print("Please enter an integer: ");
				   num1 = in.nextInt();
				   cError=false;
				}	
				else   
				{
					System.out.print("Please enter [3] if cube or [2] if square root " );
					num1 = in.nextInt();
					if (num1==3 || num1==2)
						cError=false; 
				}	
				 
				 
				 bError = false;
				  
				   
				} 
			catch (InputMismatchException e) {
				System.out.print("(Wrong input) ");
				}
				in.nextLine();
			
		} while ((bError) || (cError)) ;
	 
		return(num1);

    }

	public double calc(int num3, int op) {
		 double  answer=0.0;
		 if (op==2)   
			answer =  Math.sqrt(num3);    
		 if (op==3)
			answer =Math.cbrt(num3);	
		
		return(answer);
	   }

    public static void main(String[] args) 
    {
        int num2,num1;
		double ans;
		
		cube c= new cube();
		cube operator= new cube();
		num1=c.enternum(0);
		num2=c.enternum(1);      
	    ans=operator.calc(num1,num2);

	    System.out.println("the answer is "+ ans);


    }
}