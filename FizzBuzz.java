import java.util.Scanner;
public class FizzBuzz { // class is blueprint of a object.In class their are the behavior and the value of the object
	public static void main(String[] args) {  // method of the class fizzbuzz void is the return type of the function.
		Scanner sc = new Scanner(System.in); // new keyword is responsible for memory allocation
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if(n % 5 == 0 && n % 3 == 0) {   // The most possible case have to give at the first of the decision pending statement.
			System.out.println("FizzBuzz");
		}
		else if(n%5 == 0) {
			System.out.println("Fizz");
		}
		else if(n%3 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(n);
		}
		sc.close();
	}
}

