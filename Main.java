
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
            sc.nextLine();

            switch (ch) {
                case 1 -> lib.showBooks();
                case 2 -> lib.showMembers();
                case 3 -> {
                    System.out.print("Enter Member ID: ");
                    String mId = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bId = sc.nextLine();
                    lib.issueBook(mId, bId);
                }
                case 4 -> {
                    System.out.print("Enter Member ID: ");
                    String mId = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bId = sc.nextLine();
                    lib.returnBook(mId, bId);
                }
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
