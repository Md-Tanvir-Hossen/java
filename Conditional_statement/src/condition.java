import java.util.Scanner;
public class condition {
     public static void main(String [] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter the first value : ");
    	int firstVal = scan.nextInt();  
    	
    	System.out.println("Enter the second value : ");
    	int secVal = scan.nextInt();  
    	
    	System.out.println("----------------Result----------------");
    	if(firstVal > secVal) {
    		System.out.println(firstVal + " is bigger than " + secVal );
    	}else {
    		System.out.println(firstVal + " is smaller than " + secVal );
    	}
     }
}
