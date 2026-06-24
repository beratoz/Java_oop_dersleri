import java.util.Date;
import java.util.Random;

public class colorable_interface {
      public static void main(String[] args) {
            Random rnd = new Random();
            GeometricObject object = new GeometricObject();

      }
}

interface Colorable {
      void howtoColor();
}

abstract class GeometricObject implements Colorable {
      public String color;
      public String filled;
      public Date dateCreated;

      GeometricObject() {
            dateCreated = new Date();

      }

      GeometricObject(String color, String filled) {
            this.color = color;
            this.filled = filled;
      }

      public String getColor() {
            return color;
      }

      public String getFill() {
            return filled;
      }

      public void setColor(String color) {
            this.color = color;
      }

      public void setFill(String fill) {
            this.filled = fill;
      }

      public Date getDate() {
            return dateCreated;
      }

      public abstract void getArea();

      public abstract void getPerimeter();

      @Override
      public String toString() {
            return "color=" + color + "filled=" + filled;
      }

}

class Square extends GeometricObject {

      public void Suare(double height) {

      }
}