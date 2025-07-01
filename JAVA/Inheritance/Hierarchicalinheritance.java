// Parent class
class Person {
    void speak() {
        System.out.println("Person can speak");
    }
}

// First child class
class Parth extends Person {
    void dance() {
        System.out.println("Parth can dance");
    }
}

// Second child class
class Anaya extends Person {
    void sing() {
        System.out.println("Anaya can sing");
    }
}

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Parth s = new Parth();
        s.speak(); // inherited
        s.dance(); // own method

        Anaya a = new Anaya();
        a.speak(); // inherited
        a.sing(); // own method
    }
}
