class Asi{
	int num1;  // instance variable - A variable which declare inside a class but outside the method  
	int num2;
	public Asi(int num1, int num2){  // constructor (here num1 and num2 is the Local Variable - A variable which declare inside a method.)
		this.num1 = num1;
		this.num2 = num2;
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Asi obj =  new Asi(4,6); 
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}
}
//In output default value of integer is change.