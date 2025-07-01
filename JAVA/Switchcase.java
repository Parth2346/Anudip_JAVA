public class Switchcase {

    public static void main(String[] args) {
        String name = "Parth";

        switch (name) {
            case "Parth":
                System.out.println("Hello, Parth!");
                break;

            case "Harsh":
                System.out.println("Hi, Harsh!");
                break;

            case "Arjun":
                System.out.println("Hey, Arjun!");
                break;

            default:
                System.out.println("Name not found.");
        }
    }
}
