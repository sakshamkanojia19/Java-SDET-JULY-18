package labsessions._23_07;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound(); // Output: Cat barks
    }
}