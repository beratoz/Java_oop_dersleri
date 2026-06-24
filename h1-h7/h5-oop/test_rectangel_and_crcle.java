import java.util.Date;

public class test_rectangel_and_crcle {
      public static void main(String[] args) {
            Rectangle rec = new Rectangle(45, 35);
            Circle circ = new Circle(4.5, "yesil", true);
            System.out.println(rec.toString());
            System.out.println(rec.getArea());
            System.out.println(rec.getPerimeter());
            System.out.println(circ.toString());
            System.out.println(circ.getArea());
            System.out.println(circ.getPerimeter());
            Geometricobject geo = new Geometricobject("mavi", false);
            System.out.println(geo.toString());

      }

}

public class Geometricobject {
      private String color = "beyaz";
      private boolean filled;
      private Date dateCreated;

      Geometricobject() {
            dateCreated = new Date();
      }

      Geometricobject(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
      }

      public String getColor() {
            return color;
      }

      public void setColor(String value) {
            this.color = value;
      }

      public boolean getFilled() {
            return filled;
      }

      public void setFilled(boolean value) {
            this.filled = value;
      }

      public Date getDate() {
            return dateCreated;
      }

      public String toString() {
            return dateCreated + "tarihinde olsuturuldu" + "\n" + "renk" + color + "\n" + "doluluk durumu" + filled;
      }

}

class Rectangle extends Geometricobject {
      private double width, height;

      Rectangle(int width, int height) {
            this.width = width;
            this.height = height;

      }

      Rectangle(int width, int height, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.height = height;
            setColor(color);
            setFilled(filled);
      }

      public double getWidth() {
            return width;
      }

      public void setWidth(double width) {
            this.width = value;
      }

      public double getHeight() {
            return height;
      }

      public void setHeight(double width) {
            this.height = value;
      }

      public double getArea() {
            return width * height;

      }

      public double getPerimeter() {
            return (width * height) * 2;
      }

      public String toString() {
            return "rectangle classinin to string metodu calisti";
      }

}

class Circle extends Geometricobject {
      private double radius;

      Circle(double radius) {
            this.radius = radius;
      }

      Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
      }

      public double getRadius() {
            return radius;
      }

      public void setRadius(int value) {
            this.radius = value;
      }

      public double getArea() {
            return Math.PI * radius * radius;
      }

      public double getPerimeter() {
            return Math.PI * radius * 2;

      }

      public String toString() {
            return "circle classından toString mehodu calisti";
      }
}