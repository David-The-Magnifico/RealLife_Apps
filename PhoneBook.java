import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<String> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(String contactDetails) {
        contacts.add(contactDetails);
        Collections.sort(contacts);
        System.out.println("Contact added successfully");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty");
        } else {
            System.out.println("Contacts in the phone book:");
            for (String contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void editContact(String oldContact, String newContact) {
        int index = contacts.indexOf(oldContact);
        if (index != -1) {
            contacts.set(index, newContact);
            System.out.println("Contact edited successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    public void deleteContact(String contact) {
        if (contacts.remove(contact)) {
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter contact details:");
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Workplace: ");
                    String workplace = scanner.nextLine();
                    System.out.print("Address of Workplace: ");
                    String workplaceAddress = scanner.nextLine();

                    String contactDetails = 
                        "First Name: " + firstName + 
                        "\nLast Name: " + lastName + 
                        "\nPhone Number: " + phoneNumber + 
                        "\nAddress: " + address + 
                        "\nEmail: " + email + 
                        "\nWorkplace: " + workplace + 
                        "\nAddress of Workplace: " + workplaceAddress;
                    phoneBook.addContact(contactDetails);
                    break;
                case 2:
                    phoneBook.viewContacts();
                    break;
                case 3:
                    System.out.print("Enter the name of the contact to edit: ");
                    String contactToEdit = scanner.nextLine();
                    int index = phoneBook.contacts.indexOf(contactToEdit);
                    if (index != -1) {
                        System.out.println("Enter new contact details:");
                        System.out.print("First Name: ");
                        String newFirstName = scanner.nextLine();
                        System.out.print("Last Name: ");
                        String newLastName = scanner.nextLine();
                        System.out.print("Phone Number: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("Address: ");
                        String newAddress = scanner.nextLine();
                        System.out.print("Email: ");
                        String newEmail = scanner.nextLine();
                        System.out.print("Workplace: ");
                        String newWorkplace = scanner.nextLine();
                        System.out.print("Address of Workplace: ");
                        String newWorkplaceAddress = scanner.nextLine();

                        String newContactDetails = 
                            "First Name: " + newFirstName + 
                            "\nLast Name: " + newLastName + 
                            "\nPhone Number: " + newPhoneNumber + 
                            "\nAddress: " + newAddress + 
                            "\nEmail: " + newEmail + 
                            "\nWorkplace: " + newWorkplace + 
                            "\nAddress of Workplace: " + newWorkplaceAddress;
                        phoneBook.editContact(contactToEdit, newContactDetails);
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter the name of the contact to delete: ");
                    String contactToDelete = scanner.nextLine();
                    phoneBook.deleteContact(contactToDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
