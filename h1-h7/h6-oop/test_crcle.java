public class test_crcle {
      public static void main(String[] args) {

      }
}

class Circle2D {
      // x ve y koordinatlarını tutan private değişkenler
      private double x;
      private double y;
      private double radius;

      // Parametre almayan constructor, x ve y için 0, radius için 1 değeri atar
      public Circle2D() {
            this.x = 0;
            this.y = 0;
            this.radius = 1;
      }

      // Parametre alan constructor, gelen x, y ve radius değerlerini değişkenlere
      // atar
      public Circle2D(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
      }

      // Getter metotlar
      public double getX() {
            return x;
      }

      public double getY() {
            return y;
      }

      public double getRadius() {
            return radius;
      }

      // Dairenin alanını döndüren metot
      public double getArea() {
            return Math.PI * radius * radius;
      }

      // Dairenin çevresini döndüren metot
      public double getPerimeter() {
            return 2 * Math.PI * radius;
      }

      // Bir noktanın daire içinde olup olmadığını kontrol eden metot
      public boolean contains(double x, double y) {
            double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
            return distance <= radius;
      }
}