import java.time.LocalDate;

public class polimorfizim_demo {
      public static void main(String[] args) {
            Circle circle = new Circle(2, "kirmizi");
            // geometricobject g1 =new GeometricObject(); // new Rectangle() yada new
            // Circle( )demek gerekir
            //
            Rectangle r1 = new Rectangle(34.5, 56.7, "yesil");
            GeometricObject g2 = new Circle(5, "turuncu");
            GeometricObject g3 = new Rectangle(4, 5, "mor");

            Circle gg = (Circle) g2;
            displayObject(g2);
            displayObject(r1);
            displayObject(g3);
            displayObject(gg);
            displayObject(circle);

      }

      public static void displayObject(GeometricObject geo) {
            System.out.println("olusturuldugu tarih" + geo.getDate() + "rengi" + geo.getColor());
      }

}

class GeometricObject {
      private String color;
      private LocalDate createDate;

      public GeometricObject() {
            createDate = LocalDate.now();
      }

      public GeometricObject(String color) {
            this.color = color;
      }

      public String getColor() {
            return this.color;
      }

      public LocalDate getDate() {
            return this.createDate;
      }

}

class Circle extends GeometricObject {
      private double radius;
      private String color;
      private LocalDate createDate;

      public Circle() {
            createDate = LocalDate.now();
      }

      public Circle(double radius, String color) {
            this.color = color;
            this.radius = radius;
      }

      public String getColor() {
            return this.color;
      }
}

class Rectangle extends GeometricObject {
      private double width, height;
      private String color;
      private LocalDate createDate;

      public Rectangle() {
            createDate = LocalDate.now();
      }

      public Rectangle(double width, double height, String color) {
            this.width = width;
            this.height = height;
            this.color = color;
      }

      public String getColor() {
            return this.color;
      }
}