import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactBook book = new ContactBook();
        boolean running = true;

        while (running) {
            System.out.println("-----------------------------------------");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("-----------------------------------------");

            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();
            input = input.toLowerCase();

            switch (input) {
                case "a":
                    try {
                        System.out.println("Insert a name");
                        String name = sc.nextLine();
                        System.out.println("Insert a email");
                        String email = sc.nextLine();
                        System.out.println("Insert a phone number");
                        int phoneNum = Integer.parseInt(sc.nextLine());

                        book.addContact(name, email, phoneNum);
                    }
                    catch (Exception e) {
                        System.out.println("Error: "+ e);
                        break;
                    }

                    break;

                case "d":
                    try {
                        System.out.println("Insert a name to delete.");
                        String nameDelete = sc.nextLine();
                        book.removeContact(nameDelete);
                        System.out.println("Deleted!");
                        break;
                    }
                    catch (Exception e) {
                        System.out.println("Not in address.");
                        break;
                    }


                case "e":
                    System.out.println("Insert an email to search for contact.");
                    String email = sc.nextLine();
                    Node searchedEmail = book.searchEmail(email);
                    if (searchedEmail != null) {
                        book.printSingular(searchedEmail);
                    }
                    else {
                        System.out.println("Email not found.");
                    }
                    break;

                case "p":
                    book.printList();
                    break;

                case "s":
                    System.out.println("Insert a name to search for contact.");
                    String nameSearch = sc.nextLine();
                    Node searchedName = book.searchName(nameSearch);
                    if (searchedName != null) {
                        book.printSingular(searchedName);
                    }
                    else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case "q":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid command. Retry.");
                    break;

            }


        }
    }
}