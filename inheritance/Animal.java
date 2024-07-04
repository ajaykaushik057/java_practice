package inheritance;

// class Property{
//     void eat(){
//         System.out.println("Dog is eating");
//     }
// }

// class Dog extends Property{
//     void bark(){
//         System.out.println("Dog is Barking");
//     }
// }
// public class Animal {
//     public static void main(String[] args) {
//         Dog d1 = new Dog();
//         d1.eat();
//        d1.bark(); 
//     }
   
// }



class AnimalProperty{
    final String name;
    AnimalProperty(String name){
       this.name=name;
    }

    void sound(){
        System.out.println("Sound");
    }

    void eat(){
        System.out.println("eating");
    }

}

class Cat extends AnimalProperty{
    Cat(String name){
        super(name);
    }
    
    void sound(String soundname){
        System.out.println(super.name + "sound is meow");
    }
    void eat(){
        System.out.println("cat is eating");
    }

}

public class Animal {

    public static void main(String[] args) {
        Cat c1 = new Cat("CAT");
         c1.eat();
         c1.sound();
         c1.sound("Meow");
    }
}