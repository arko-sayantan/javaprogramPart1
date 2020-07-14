import java.util.Scanner;

public class ObjectDemo { // Class is blueprint of a object.In class their are the behavior and the value of the object
	public static void main(String[] args) { // Here 'main' is method.the function which include in the class is called method.
		Scanner sc = new Scanner(System.in);  //  System.in is a standard input stream  
		
		Clac obj = new Clac(); /* knows something and does something.Here 'obj' is the object reference 
		 						 And 'new' is the keyword for memory allocation */
		System.out.print("Enter 1st Number : ");
		obj.a = sc.nextInt();  // Assign the value to the class 'Clac'. And the data-type already assign in class Clac. 
		
		System.out.print("Enter 2nd Number : ");
		obj.b = sc.nextInt();
			    
		System.out.println("Enter your Choice");
		System.out.println("1.Addition  2.Subtraction  3.multiplication  4.Division");
	    System.out.print("Enter your choice : "); 
	    obj.n = sc.nextInt();
	
	    obj.perform(); // this called the method of class Clac.
		
		sc.close();
	}
}
//this is the class of the obj object
class Clac{  
	
	int a;
	int b;
	int n;
	public void perform() {
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
	}
}

