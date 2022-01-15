import java.util.Scanner;
public class flow {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("-------------For Loop-------------");
		System.out.println("Start Value : ");
		int x = scan.nextInt();
		
		System.out.println("End Value : ");
		int y = scan.nextInt();
		
		
		System.out.println("The result is :-  ");
		for (int i = x; i < y; i++) {
		      System.out.println(i);
		    }
		
		
//		While loop
		
		System.out.println("-------------While loop-------------");
		System.out.println("Start Value : ");
		int i = scan.nextInt();
		
		System.out.println("End Value : ");
		int j = scan.nextInt();
		
		while (i < j) {
		  System.out.println(i);
		  i++;
		}
	    
	    
	    
	}
}
