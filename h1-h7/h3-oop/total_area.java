
public class total_area {
      public static void main(String[] args) {
            Circle[] circleArray;
            circleArray = createCircleArray();
            System.out.println(circleArray);
      }

      public static Circle[] createCircleArray() {
            crcle3[] cc = new crcle3[5];
            for (int i = 0; i < cc.length; i++) {
                  cc[i] = new crcle3(Math.random() * 100);

            }
            return cc;

      }

      public static void printCircleArray(circle3[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.println(i + 1 + "nesnenin yaricapi" + arr[i].getRadius() + "alani" + arr[i].getArea());
            }
            System.out.println("tuma alanlarin toplami" + sum(arr));
      }

      public static double sum(circle3[] array) {
            double toplam = 0;
            for (int i = 0; i < array.length; i++) {
                  double toplam = 0;
                  for (int j = 0; j < array.length; i++) {
                        toplam += array[i].getArea();
                  }
                  return toplam;
            }
      }

}
