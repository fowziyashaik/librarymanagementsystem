
import model.*;
import service.LibrarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySystem lib = new LibrarySystem();
        Scanner sc = new Scanner(System.in);

        lib.addBook(new Book("B1", "Java Programming"));
        lib.addBook(new Book("B2", "Data Structures"));
        lib.registerMember(new StudentMember("M1", "Alice"));
        lib.registerMember(new FacultyMember("M2", "Dr. Bob"));

        while (true) {
            System.out.println("\n--- Library System ---");
            System.out.println("1. View Books");
            System.out.println("2. View Members");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    lib.showMembers();
                    break;
                case 3:
                    System.out.print("Enter Member ID: ");
                    String mIdIssue = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bIdIssue = sc.nextLine();
                    lib.issueBook(mIdIssue, bIdIssue);
                    break;
                case 4:
                    System.out.print("Enter Member ID: ");
                    String mIdReturn = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bIdReturn = sc.nextLine();
                    lib.returnBook(mIdReturn, bIdReturn);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
