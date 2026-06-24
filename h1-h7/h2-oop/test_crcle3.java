public class test_crcle3 {
      public static void main(String[] args) {
            crcle3 c1 = new crcle3(5);
            System.out.println("c1 nesnesi icin yaricap" + c1.getRadius() + "alan" + c1.getArea());
            c1.setRadius(c1.getRadius() * 1.3);
            System.out.println("c1 yaricap" + c1.getRadius() + "alan" + c1.getArea());
            System.out.println("c1 nesnesi icicn static object sayisi" + crcle3.getNumberOfObjects());
            printCircle(c1);
            int n = 5;
            printAreas(c1, n);
      }

      public static void printCircle(crcle3 cc) {
            System.out.println("cc nesnesi icin yaricap" + cc.getRadius() + "alan" + cc.getArea());
      }

      public static void printAreas(crcle3 cc, int times) {
            System.out.println("yaricap alan \t");
            while (times >= 1) {
                  System.out.println(cc.getArea() + "\t \t" + cc.getArea());
                  cc.setRadius(cc.getRadius() + 1);
                  times--;
            }
            System.out.println("degisgenin son degeri" + times);

      }

}

class crcle3 {
      private double radius = 1;
      private static int numberOfobjects = 0;

      public crcle3() {
            numberOfobjects++;
      }

      public crcle3(double new_radius) {
            radius = new_radius;
            numberOfobjects++;

      }

      public double getRadius() {
            return radius;

      }

      public void setRadius(double new_radius) {
            radius = (new_radius >= 0) ? new_radius : 0;

      }

      public static int getNumberOfObjects() {
            return numberOfobjects;
      }

      public double getArea() {
            return radius * radius * Math.PI;
      }

}
