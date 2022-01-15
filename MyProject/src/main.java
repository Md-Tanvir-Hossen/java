import java.util.Scanner;
public class main {
	public static void main(String[]args) {
		
		 Scanner scan = new Scanner(System.in);  
		 
		 
		    System.out.println("Your Name : ");
		    String name = scan.nextLine();  
		    
		    System.out.println("Your Age : ");
		    int age = scan.nextInt();  
		    
		    scan.nextLine();   
		    
		    System.out.println("college : ");
		    String clg = scan.nextLine();    
		    
		    scan.nextLine();    
		    
		    System.out.println("Dept : ");
		    String dept = scan.nextLine();    
		    
		    System.out.println("Hi , my name is " + name + ". My age " + age + " Years Old , ");
		    System.out.println("I'm a student at " + clg + ". at " + dept + " departement.");

	}

}
