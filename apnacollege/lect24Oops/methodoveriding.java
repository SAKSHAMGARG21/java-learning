class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // @Override
    void sound() {
        System.out.println("The cat meows");
    }
}

public class methodoveriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound(); // Output: The animal makes a sound
        myDog.sound(); // Output: The dog barks
        myCat.sound(); // Output: The cat meows
    }
}