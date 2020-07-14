class Student{
	int sRoll;
	String sSec;
	static String school;  // If we use static keyword then the value of variable is same for every object.
							// So this type of variable is known a static variable
	static{
		school = "Shibpur S.S.P.S Vidyalaya";   //  Applicable when you load a class.
	}
	public void show() {
		System.out.println(sRoll + ":          " + sSec +":          " + school);
	} 
	
}
public class StaticDemo {
	public static void main(String[] args) {
		
		Student sayantan = new Student();
		sayantan.sRoll = 15;
		sayantan.sSec  = "G";
	 	// Student.school = "Shibpur S.S.P.S Vidyalaya";  // For static variable we can also use class name for assign the value.
															// if we use static block then Does not initial the value of variable.
		
		Student arko = new Student();
		arko.sRoll = 19;
		arko.sSec = "F";
		
		System.out.println("Details : ");
		System.out.println("Roll         Sec         School");
		System.out.println();
		
		sayantan.show();
		arko.show();
	}  
}
