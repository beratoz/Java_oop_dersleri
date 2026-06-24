
public class test_overload {
      public static void main(String[] args) {
            Sum s = new Sum();
            System.out.println(s.sum(34, 45));
            System.out.println(s.sum(40, 70, 90));
            System.out.println(s.sum(56.6, 45.3));

      }

}

class Sum {
      public int sum(int x, int y) {
            System.out.println("2parametreli olan sum methodu çalıştı");
            return x + y;
      }

      public int sum(int a, int b, int c) {
            System.out.println("3 parametreli olan");
            return a + b + c;
      }

      public double sum(double x, double y) {
            System.out.println("double tipinde");
            return x + y;
      }

}