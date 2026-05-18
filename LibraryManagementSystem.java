import java.util.ArrayList;
import java.util.Scanner;

class Book {

    String title;

    Book(String title) {
        this.title = title;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    books.add(new Book(title));

                    System.out.println("Book Added Successfully.");
                    break;

                case 2:

                    System.out.println("\nList of Books:");

                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            System.out.println("- " + b.title);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();

                    boolean found = false;

                    for (Book b : books) {

                        if (b.title.equalsIgnoreCase(searchTitle)) {
                            System.out.println("Book Found: " + b.title);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter title to remove: ");
                    String removeTitle = sc.nextLine();

                    boolean removed = false;

                    for (Book b : books) {

                        if (b.title.equalsIgnoreCase(removeTitle)) {
                            books.remove(b);
                            System.out.println("Book Removed Successfully.");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 5:

                    System.out.println("Exiting Library System...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}