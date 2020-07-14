// Inside a class we create Variable , Method , Class.
// So also create a class inside a class.In this program we know how to create and how to call a inner class method.
	
class Outer{   // So this a outer Class
	int i;
	public void show() {
		System.out.println("This is Outer class method");
	}
	class inner { //  this Class is Inner Class Because this is inside a another class.
		public void display() {
			System.out.println("This is inner class method");
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
	   //class name     constructor
		Outer obj = new Outer(); // 'Obj' is a outer class object reference
		
		Outer.inner obj1 = obj.new inner();  // So This way we assign inner class.
		 								//Here we create inner class with help of outer class and inner class object reference.
										//Syntax -> OCN.ICN ICOR = OCOR.new ICC;
										/*OCN -> Outer class name
										 * ICN -> Inner class name
										 * ICOR -> Inner class object reference 
										 * OCOR -> Outer  ""    ""     ""
										 * ICC -> Inner class Constructor
										* */
		obj.show();				
		obj1.display();
	}
}
