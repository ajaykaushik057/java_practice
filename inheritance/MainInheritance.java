package inheritance;

class A {
	A(){
		System.out.println("Constructor A");
	}
	String name="";
	void display() {
		System.out.println("this is class A");
	}
}
class B extends A {
	B(){
		System.out.println("Constructor B");
	}
	int value=10;
	void print() {
		System.out.println("this is class B");
	}
	
}

public class MainInheritance {

	public static void main(String[] args) {
		
//             A a1=new A();
//             a1.name="Class A";
//             System.out.println("Value of Name="+a1.name);
//             a1.display();
             B b1=new B();
//             b1.name="Class B";
//             System.out.println("Value of Name="+b1.name);
//             b1.display();
//             b1.print();
//             System.out.println("Value="+b1.value);
	}

}