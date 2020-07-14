// Loop is a iteration of program in java their are 4 loop
/* 1. While (The condition checked first entry control loop)
  * 2. do-while(The condition checked at the end of the loop. exit control lopp.and loop 
  * will be iterated at least once)
  * 3. for loop (If we know how many time the loop will iterated 
  * then only we use for loop, here initialisation condition incrementation all things 
  * written in one line)
  * 4. for-each loop (this is a enhance for loop)
  * */

import java.util.Scanner;
public class Forloop {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter the value you eant to factorial : ");
	int n =sc.nextInt();
	int fac = 1;
	for(int i=1;i<=n;i++) {  // For loop -> here initialisation condition incrementation all things written in one line		 
		fac *= i;
	}
	System.out.println("The factorial is : "+ fac);
	sc.close();	
}
}
