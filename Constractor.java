class Con2{
	int num1;
	int num2; /*By default Java crate a constructor in class Con2.But 
	           *This constructor does not assign any value it crate a memory for this class only  
	           *or Change the default value of the integer
	           **/
		
	public Con2() {
		System.out.println("Now the default value is : ");
		num1 = 7;
	}
}


public class Constractor {

	public static void main(String[] args) {
		
		Con2 Obj = new Con2();// Constructor 
		
		System.out.println(Obj.num1);
	}

}
