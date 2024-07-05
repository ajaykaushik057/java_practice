package polymorphism;

class Area{
    int r,l,b;
    static void getArea(){
        System.out.println("for getting Area");
    }
}

class Circle extends Area{
    void getArea(int r){
        System.out.println("Area of circle: "+ (Math.PI*r*r));
    }

    static void getArea(){
        System.out.println("In circle");
    }
}
public class Main {
 public static void main(String[] args) {
    // Area a1 = new Area();
    // a1.getArea();
    // Circle c1 = new Circle();
    // c1.getArea(6);

    Circle c1 = (Circle)new Area();  // downCasting
    c1.getArea(6);

    Area a1 = new Circle();       // upCasting
    a1.getArea();
    
 }
    
}