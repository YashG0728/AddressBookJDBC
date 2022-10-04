import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) throws IOException {
        System.out.println("WELCOME TO ADDRESSBOOK");
        boolean t = true;
        while (t) {
            System.out.println("[-----MENU-----]");
            System.out.println("1.Create Contact");
            System.out.println("0.Exit");
            System.out.println("CHOOSE OPTION");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ABOOperations.createContact();
                    break;
                case 0:
                    break;
            }
        }
    }
}
