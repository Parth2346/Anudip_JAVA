class main1 {
    // First interface
    interface Dancer {
        void dance();
    }

    // Second interface
    interface Singer {
        void sing();
    }

    // Class implementing both interfaces
    class Parth implements Dancer, Singer {
        public void dance() {
            System.out.println("Parth can dance.");
        }

        public void sing() {
            System.out.println("Parth can sing.");
        }
    }

    // Main class
    public class Main {
        public static void main(String[] args) {
            Parth s = new Parth();
            s.dance();
            s.sing();
        }
    }

}
