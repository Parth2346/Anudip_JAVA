// Interface 1
interface Dancer {
    void dance();
}

// Interface 2
interface Speaker {
    void speak();
}

// Base class
class Person implements Speaker {
    public void speak() {
        System.out.println("Person can speak.");
    }
}

// Child class
class Parth extends Person implements Dancer {
    public void dance() {
        System.out.println("Parth can dance.");
    }

    public void sing() {
        System.out.println("Parth can sing.");
    }
}

// Main class
public class Hybridinheritance {
    public static void main(String[] args) {
        Parth s = new Parth();
        s.speak(); // from Person
        s.dance(); // from Dancer
        s.sing(); // in Parth
    }
}
