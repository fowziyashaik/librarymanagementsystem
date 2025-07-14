
package service;

import model.*;

import java.util.*;

public class LibrarySystem {
    private List<Book> books = new ArrayList<>();
    private Map<String, Member> members = new HashMap<>();
    private Map<String, List<String>> issuedBooks = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
        issuedBooks.put(member.getMemberId(), new ArrayList<>());
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void showMembers() {
        for (Member m : members.values()) {
            System.out.println(m);
        }
    }

    public void issueBook(String memberId, String bookId) {
        Member m = members.get(memberId);
        if (m == null) {
            System.out.println("Member not found.");
            return;
        }

        Book b = findBook(bookId);
        if (b == null || b.isIssued()) {
            System.out.println("Book unavailable.");
            return;
        }

        List<String> issued = issuedBooks.get(memberId);
        if (issued.size() >= m.getMaxBooksAllowed()) {
            System.out.println("Book limit reached for " + m.getName());
            return;
        }

        b.issue();
        issued.add(bookId);
        System.out.println("Book issued successfully.");
    }

    public void returnBook(String memberId, String bookId) {
        Book b = findBook(bookId);
        if (b != null && b.isIssued()) {
            b.returnBook();
            issuedBooks.get(memberId).remove(bookId);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Invalid book or already returned.");
        }
    }

    private Book findBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) return b;
        }
        return null;
    }
}
