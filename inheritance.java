// First interface with abstract method
interface Walkable {
    void walk();
}

// Second interface with abstract method
interface Swimmable {
    void swim();
}

// Concrete class implementing multiple interfaces
class Human implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Human is walking.");
    }

    public void swim() {
        System.out.println("Human is swimming.");
    }
}

class Main {
    public static void main(String[] args) {
        Human person = new Human();
        person.walk(); // Output: Human is walking.
        person.swim(); // Output: Human is swimming.
    }
}
