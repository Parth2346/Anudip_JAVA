// First interface
interface Writer {
    void write();
}

// Second interface
interface Reader {
    void read();
}

// Class implementing both interfaces
class Parthi implements Writer, Reader {
    public void write() {
        System.out.println("Parthi is writing Java code.");
    }

    public void read() {
        System.out.println("Parthi is reading Java notes.");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Parthi s = new Parthi();
        s.write();
        s.read();
    }
}