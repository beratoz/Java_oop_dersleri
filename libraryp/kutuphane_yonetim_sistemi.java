import java.util.ArrayList;
import java.util.List;

public class kutuphane_yonetim_sistemi {
      public static void main(String[] args) {
            ArrayList<String> book = new ArrayList<String>();
            ArrayList<String> member = new ArrayList<String>();
            Library library = new Library(book, member);
            library.addBook("Nutuko");
            System.out.println("kitaplar" + library.getBooks());

      }
}

class Book {
      private String title;
      private String author;
      private String isbn;
      private boolean isAvailable;

      public Book(String title, String author, String isbn, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.isAvailable = isAvailable;
      }

      public String getAuthor() {
            return author;
      }

      public void setAuthor(String author) {
            this.author = author;
      }

      public String getIsbn() {
            return isbn;
      }

      public String getTitle() {
            return title;
      }

      @Override

      public String toString() {
            return "kitap" + title + "yazar" + author + "isbn" + isbn;

      }

}

class Member {
      private String name;
      private int memberId;
      private List<String> members;
      private List<String> borrowedBooks;

      public Member(String name, int memberId, List<String> members) {
            this.name = name;
            this.memberId = memberId;
            this.borrowedBooks = new ArrayList<>();
      }

      public Member(ArrayList<String> members) {
            this.members = members;
      }

      public void addMember(String member) {
            members.add(member);
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public int getMemberId() {
            return memberId;
      }

      public void setMemberId(int memberId) {
            this.memberId = memberId;
      }

      public List<String> getBorrowedBooks() {
            return borrowedBooks;
      }

      public void setBorrowedBooks(List<String> borrowedBooks) {
            this.borrowedBooks = borrowedBooks;
      }

      public void addBorrowedBooks(String book) {
            this.borrowedBooks.add(book);
      }
}

class Library {
      private List<String> books;
      private List<String> members;

      public Library(List<String> books, List<String> members) {
            this.books = books;
            this.members = members;

      }

      public List<String> getBooks() {
            return books;
      }

      public void setBooks(List<String> books) {
            this.books = books;
      }

      public List<String> getMembers() {
            return members;
      }

      public void setMembers(List<String> members) {
            this.members = members;
      }

      public void addBook(String books) {
            this.books.add(books);
      }

      public void addMember(String member) {
            this.members.add(member);
      }

}