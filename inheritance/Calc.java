package inheritance;

abstract class Sum{
    int num1,num2;
    void getSum(int num1,int num2){
        System.out.println("Sum = "+(num1+num2));
    }
    abstract void displaySum();
}

class sumSub extends Sum{
   sumSub(int num1 , int num2){
    this.num1=num1;
    this.num2=num2;
   }

   void displaySum(){
      System.out.println("Sum="+(super.num1+super.num2));
   }
}
public class Calc {
    public static void main(String[] args) {
        sumSub s1=new sumSub(23,45);
		s1.displaySum();
		s1.getSum(13,45);

        Sum s2 = new Sum(){
            @Override

            void displaySum(){
                System.out.println("Sum by Anonymous Sub Class="+(super.num1+super.num2));
            }
        };
        s2.num1=10;
        s2.num2=20;
        s2.displaySum();
        s2.getSum(50,60);
    }

//         Sum s1;  //Object Declaration
//         s1=new Sum();  //Object Instantiation :- Wrong for abstract class
//         
//         Sum s2=new Sum();///Wrong for Abstract Class
}
