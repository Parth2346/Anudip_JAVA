// Parent class
class Person {
    void speak() {
        System.out.println("Person can speak.");
    }
}

// Child class
class Parth extends Person {
    void study() {
        System.out.println("Parth is studying Java.");
    }
}

// Main class
public class Singleinheritance {
    public static void main(String[] args) {
        Parth s = new Parth();
        s.speak(); // Inherited from Person
        s.study(); // Own method of Parth
    }
}
