import java.util.*; // import the Scanner class 
public class DecisionPendingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //  System.in is a standard input stream  

		System.out.print("Enter 1st Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd Number : ");
		int b = sc.nextInt();
	    
		System.out.println("Enter your Choice");
		System.out.println("1.Addition  2.Subtraction  3.multiplication  4.Division");
	    System.out.print("Enter your choice : "); 
	    int n = sc.nextInt();
	    switch(n) {   // After java 1.7 you can pass string in the switch. 
	    case 1:
	    	System.out.println("your result is : "+ (a+b));
	    	break;
	    case 2:
	    	System.out.println("your result is : "+ (a-b));
	    	break;
	    case 3:
	    	System.out.println("your result is : "+ (a*b));
	    	break;
	    case 4:
	    	System.out.println("your result is : "+ (float)a/b);
	    	break;
	    default:
	    	System.out.println("Enter proper choice");
	    	
	    }
	    System.out.println("The end !!!");
		sc.close(); // Close the input scanner
	}
}
