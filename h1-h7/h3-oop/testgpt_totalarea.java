public class testgpt_totalarea {
      public static void main(String[] args) {
            Circle[] circleArray;
            circleArray = createCircleArray(); // Daire dizisi oluşturuldu
            printCircleArray(circleArray); // Daire dizisi yazdırıldı
      }

      public static Circle[] createCircleArray() {
            Circle[] cc = new Circle[5]; // Tip düzeltildi: Circle
            for (int i = 0; i < cc.length; i++) {
                  cc[i] = new Circle(Math.random() * 100); // Circle nesnesi oluşturuluyor
            }
            return cc;
      }

      public static void printCircleArray(Circle[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.println(
                              (i + 1) + ". nesnenin yarıçapı: " + arr[i].getRadius() + " alanı: " + arr[i].getArea());
            }
            System.out.println("Tüm alanların toplamı: " + sum(arr));
      }

      public static double sum(Circle[] array) {
            double toplam = 0;
            for (int i = 0; i < array.length; i++) {
                  toplam += array[i].getArea();
            }
            return toplam;
      }
}

// Circle sınıfı tanımı (örnek bir tanım)
class Circle {
      private double radius;

      public Circle(double radius) {
            this.radius = radius;
      }

      public double getRadius() {
            return radius;
      }

      public double getArea() {
            return Math.PI * radius * radius;
      }
}
