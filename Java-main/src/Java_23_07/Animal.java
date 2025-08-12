package Java_23_07;

// Superclass
public class Animal {
    public void eat() {
        System.out.println("Animals eat food");
    }
}

// Subclass 1
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}

// Subclass 3
class Cow extends Animal {
    public void moo() {
        System.out.println("Cow moos");
    }
}

// Main class (renamed to avoid conflict)
class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

        Cow cow = new Cow();
        cow.eat();
        cow.moo();
    }
}
