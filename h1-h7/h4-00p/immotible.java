import java.util.Date;

public class immotible {
      public static void main(String[] args) {
            Student s1 = new Student(12345, "Ayse");
            Date gelentarih = s1.getDate();
            gelentarih.setTime(4000);

      }

}

class Student {
      private int id;
      private String name;
      private Date tarih;

      Student() {

      }

      Student(int id, String name) {
            this.id = id;
            this.name = name;
            tarih = new Date();

      }

      public int getId() {
            return id;
      }

      public String getName() {
            return name;
      }

      public Date getDate() {
            return tarih;

      }
}
