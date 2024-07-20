interface Animal {
    public void sound();
}

@FunctionalInterface
interface Cat extends Animal {
    default void color() {
        System.out.println("Cat color: RED");
    }
}

class Example implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Functional_interface {
    public static void main(String[] args) {
        // Creating an instance of Example and calling the sound method
        Example example = new Example();
        example.sound();
        
        // Using a lambda expression to implement the Cat functional interface
        Cat cat = () -> System.out.println("Meow from lambda");
        cat.sound();
        cat.color();
    }
}