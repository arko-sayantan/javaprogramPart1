public class DecisionPendingIF_else {

	public static void main(String[] args) {
		// Decision pending operation means where we work on two or more different possibility or case and  
		//decide in only one case for execution 
		//Here we study IF Else And IF Else-if
		int a =  120;
		
		//IF-Else
		
		if (a%2 == 0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
		// If-Else if
		
		if (a>0) {
			System.out.println("The number is Positive");
		}
		else if(a<0){
			System.out.println("The number is Negetive");
		}
		else {
			System.out.println("The number is Zero");
		}
	}
	
}