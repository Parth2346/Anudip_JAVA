// Grandparent class
class Grandmother {
    void cook() {
        System.out.println("Grandmother can cook.");
    }
}

// Parent class
class Mother extends Grandmother {
    void sing() {
        System.out.println("Mother can sing.");
    }
}

// Child class
class Parth extends Mother {
    void dance() {
        System.out.println("Parth can dance.");
    }
}

// Main class
public class Multilevelinheritance {
    public static void main(String[] args) {
        Parth s = new Parth();
        s.cook(); // From Grandmother
        s.sing(); // From Mother
        s.dance(); // From Parth
    }
}
