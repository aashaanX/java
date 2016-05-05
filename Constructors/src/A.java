
public class A {
	A(){
		this(100);
		System.out.println("From Constructor without arg");
	}
	A(int a){
		System.out.println("From Constructor with arg");
		System.out.println(a);
	}

	public static void main(String[] args) {
		A a = new A();
	}

}
// Constructors are methode with same Class name.
// They are called when object is created
// they will not return any value
// though the will return control flow
// default return type of Constructor is Void
// a class can have multiple constructors
// which constructor is executed is based on the number of arguments in constructor
// when no constructor is made in java program compiler automaticaly create one in the binary file will null argumnet and blank body
// for objects with value if no constructor is defined then it will throw error because automatic creation is not done in binary file.
