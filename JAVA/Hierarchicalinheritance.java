// Parent class
class Person {
    void speak() {
        System.out.println("Person can speak.");
    }
}

// First child class
class Parth extends Person {
    void dance() {
        System.out.println("Parth can dance.");
    }
}

// Second child class
class Tanu extends Person {
    void sing() {
        System.out.println("Tanu can sing.");
    }
}

// Main class
public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Parth s = new Parth();
        s.speak();
        s.dance();

        Tanu t = new Tanu();
        t.speak();
        t.sing();
    }
}
