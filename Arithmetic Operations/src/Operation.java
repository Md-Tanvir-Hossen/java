import java.util.Scanner;
public class Operation {
	public static void main(String []arg) {
		
		Scanner scan = new Scanner(System.in);
    	
		System.out.println("----------Addition----------");
		
    	System.out.println("Enter the first value : ");
    	double addfirstVal = scan.nextDouble();
    	
    	System.out.println("Enter the second value : ");
    	double addsecVal = scan.nextDouble();
   
    	double sum = addfirstVal + addsecVal;
    	
    	System.out.println("The Addition Result is " + sum);
    	
    	System.out.println("  ");
    	System.out.println("  ");
    	System.out.println("  ");


    	
System.out.println("----------Subtraction----------");
		
   	System.out.println("Enter the first value : ");
   	double subfirstVal = scan.nextDouble();
   	
   	System.out.println("Enter the second value : ");
    	double subsecVal = scan.nextDouble();
    	
    	double sub = subfirstVal -  subsecVal; 
   	
    	System.out.println("The Subtraction Result is " + sub);
    	
    	System.out.println("  ");
    	System.out.println("  ");
    	System.out.println("  ");
    	
    	
System.out.println("----------Multiplication----------");
		
    	System.out.println("Enter the first value : ");
   	double mulfirstVal = scan.nextDouble();
    	
    	System.out.println("Enter the second value : ");
    	double mulsecVal = scan.nextDouble();
    	
  	double mul = mulfirstVal *  mulsecVal; 
   	
    	System.out.println("The Multiplication Result is " + mul);
    	
    	System.out.println("  ");
    	System.out.println("  ");
     	System.out.println("  ");
    	
    
    	
System.out.println("----------Division----------");
		
    	System.out.println("Enter the first value : ");
    	double divfirstVal = scan.nextDouble();
    	
    	System.out.println("Enter the second value : ");
    	double divsecVal = scan.nextDouble();
    	
    	double div = divfirstVal /  divsecVal; 
    	
    	System.out.println("The Division Result is " + div);	
    	
    	System.out.println("  ");
    	System.out.println("  ");
    	System.out.println("  ");  	
    	
		
System.out.println("----------Modulus----------");
		
    	System.out.println("Enter the first value : ");
    	double modfirstVal = scan.nextDouble();
    	
    	System.out.println("Enter the second value : ");
    	double modsecVal = scan.nextDouble();
    	
    	double mod = modfirstVal / modsecVal; 
    	
    	System.out.println("The Modulus Result is " + mod);		
    	
    	
    	
		
	}
}
