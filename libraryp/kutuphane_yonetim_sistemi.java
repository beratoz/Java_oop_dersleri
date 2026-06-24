import java.util.ArrayList;
import java.util.List;

public class kutuphane_yonetim_sistemi {
      public static void main(String[] args) {
            ArrayList<String> book = new ArrayList<String>();
            ArrayList<String> member = new ArrayList<String>();
            Library library = new Library(book, member);
<<<<<<< HEAD
            library.addBook(1, "Nutuk", "Ataturk");
            library.addBook(2, "Safahat", "Mehmet Akif Ersoy");
            library.addBook(3, "Bati Felsefe Tarihi", "Bertrand Russell");
            library.addBook(4, "Evlilik Ve Ahlakan", "Bertrand Russell");
            library.addMember(1, "Ayse");
            library.addMember(2, "Berat");
            library.listBooks();

            System.out.println("kitaplar" + library.getBooks());
            System.out.println("uyeler" + library.getMembers());
            System.out.println("1.uye" + "-->" + member.get(0));
            System.out.println("2.uye" + "-->" + member.get(1));
            // Arama metodu
            String searchBook = "asdf";
            if (library.searchBooks(searchBook)) {
                  System.out.println("aranan KITAP mevcut");
            } else {
                  System.out.println("aranan KITAP mevcutdegil");
            }
            String searchMembers = "Ayse";
            if (library.searchMembers(searchMembers)) {
                  System.out.println("aranan KISI mevcut");
            } else {
                  System.out.println("aranan KISI mevcut degil");
            }
=======
            library.addBook("Nutuko");
            System.out.println("kitaplar" + library.getBooks());
>>>>>>> 0cfa3d99b4e7d1ea1a20b0cd687b56ae5893a87e

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

<<<<<<< HEAD
      public void setIsbn(String isbn) {
            this.isbn = isbn;
      }

=======
>>>>>>> 0cfa3d99b4e7d1ea1a20b0cd687b56ae5893a87e
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
<<<<<<< HEAD
=======
      private List<String> members;
>>>>>>> 0cfa3d99b4e7d1ea1a20b0cd687b56ae5893a87e
      private List<String> borrowedBooks;

      public Member(String name, int memberId, List<String> members) {
            this.name = name;
            this.memberId = memberId;
            this.borrowedBooks = new ArrayList<>();
      }

<<<<<<< HEAD
=======
      public Member(ArrayList<String> members) {
            this.members = members;
      }

      public void addMember(String member) {
            members.add(member);
      }

>>>>>>> 0cfa3d99b4e7d1ea1a20b0cd687b56ae5893a87e
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

<<<<<<< HEAD
      public void addBook(int Isbn, String books, String author) {
            this.books.add(books);
      }

      public void addMember(int memberId, String member) {
            this.members.add(member);
      }

      public void listBooks() {// +
            for (String book : books) {// +
                  System.out.println(book);// +
            } // +
      }// +

      public boolean searchBooks(String bookName) {
            for (String book : books) {
                  if (book.equals(bookName)) {
                        return true;
                  }

            }
            return false;
      }

      public boolean searchMembers(String membersName) {
            for (String member : members) {
                  if (member.equals(membersName)) {
                        return true;
                  }

            }
            return false;
      }

=======
      public void addBook(String books) {
            this.books.add(books);
      }

      public void addMember(String member) {
            this.members.add(member);
      }

>>>>>>> 0cfa3d99b4e7d1ea1a20b0cd687b56ae5893a87e
}