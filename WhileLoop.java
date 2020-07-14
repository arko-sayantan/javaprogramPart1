import java.util.Scanner; // import the Scanner package
public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //  System.in is a standard input stream 
		System.out.print("Enter your Value : ");
		int a = sc.nextInt();
		int i=1;// initialisation
		
		// Loop is a iteration of program in java their are 4 loop 
		/* 1. While (The condition checked first entry control loop)
		 * 2. do-while(The condition checked at the end of the loop. exit control lopp.and loop 
		 * will be iterated at least once)
		 * 3. for loop (If we know how many time the loop will iterated 
		 * then only we use for loop, here initialisation condition incrementation all things 
		 * written in one line)
		 * 4. for-each loop (this is a enhance for loop)
		 * */
		
		while (i<=a) { // Condition
			System.out.println("Hello World");
			i++; // incrementation
		}
		sc.close(); // Close the input scanner
	}
}
