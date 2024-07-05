// The interface in Java is a mechanism to achieve abstraction. There can be only 
// abstract methods in the Java interface, not the method body. It is used to achieve 
// abstraction and multiple inheritances in Java using Interface. In other words, 
// you can say that interfaces can only have methods that are abstract and variables
//  that are public, static and final by default. It cannot have a method body. Java Interface
//  also represents the IS-A relationship.


package interface_;

interface Calc{
    int num1=10;                 // public static final
    int getSum(int n1,int n2);   // public and abstract
    int getMul(int n1,int n2);
}

class Calculator implements Calc{
    @Override
     public int getSum(int n1,int n2){
        return (n1+n2);
     }

    @Override
    public int getMul(int n1, int n2) {
        return (n1*n2);
    }
}
public class InterfaceMain {
 public static void main(String[] args) {
    System.out.println(Calc.num1);
    Calculator c1 = new Calculator();
    System.out.println("Sum: "+c1.getSum(56,65));
    System.out.println("Mul: "+c1.getMul(5,6));

    // Calc c2 = new Calc();  //Gives Error because interface directly instantiate.

    Calc c2=new Calc() {

        @Override
        public int getSum(int n1, int n2) {
            return 0;
        }

        @Override
        public int getMul(int n1, int n2) {
            return (n1*n2);
        }
        
    };
    System.out.println("Multiply ="+c2.getMul(23,34));

 }
    
}