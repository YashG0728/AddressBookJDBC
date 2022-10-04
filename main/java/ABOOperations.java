import java.util.ArrayList;
import java.util.Scanner;

public class ABOOperations {

    public static void createContact(){
        ArrayList<Person> list = new ArrayList<>();
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();;
        System.out.println("Enter Last Name");
        String lastName = sc.nextLine();
        System.out.println("Enter Address Name");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter PhoneNumber Name");
        String address = sc.nextLine();
        System.out.println("Enter City Name");
        String city = sc.nextLine();
        System.out.println("Enter State Name");
        String state = sc.nextLine();
        System.out.println("Enter Zip Name");
        String zip = sc.nextLine();
        System.out.println("Enter Email Name");
        String email = sc.nextLine();

        person.setFirstName(firstName);
        person.setFirstName(lastName);
        person.setFirstName(phoneNumber);
        person.setFirstName(address);
        person.setFirstName(city);
        person.setFirstName(state);
        person.setFirstName(zip);
        person.setFirstName(email);
    }
}
