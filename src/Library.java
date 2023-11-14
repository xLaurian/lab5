import java.util.Scanner;
import java.util.*;
public class Library {

    ArrayList<Book> books = new ArrayList<Book>(100);
    private User[] users;
    private int bookCount;
    private int userCount;


    public Library() {
        this.users = new User[100]; // Se presupune o capacitate inițială de 100 de utilizatori
        this.bookCount = 0;
        this.userCount = 0;
    }

    public void readbooks() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] bookInfo = input.split(", ");
            if (bookInfo.length == 5) {
                String title = bookInfo[0];
                int year = Integer.parseInt(bookInfo[1]);
                String publisher = bookInfo[2];
                int recommendedAge = Integer.parseInt(bookInfo[3]);
                float price = Float.parseFloat(bookInfo[4]);
                Book book_def= new Book(title, year, publisher, recommendedAge, price);
                books.add(book_def);
                bookCount++;
            } else {
                System.out.println("Introduceți date valide pentru carte!");
            }
        }
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void sortBooks() {
        Collections.sort(books);
    }

    public Book getBookPosition(int i) {
        return books.get(i);
    }

}
