
public class test_interface {
      public static void main(String[] args) {
            Dev3 d3 = new Dev3();
            d3.deposit();
            d3.withdraw();
            d3.account();
            d3.loan();

      }

}

interface Bank {
      void deposit();

      void withdraw();

      void loan();

      void account();
}

// lvl 1
abstract class Dev1 implements Bank {
      public void deposit() {
            System.out.println("depozito miktari--" + 500 + "tl");
      }

}

// lvl 2
abstract class Dev2 extends Dev1 {
      public void withdraw() {
            System.out.println("cekilen tutar--" + 5000 + "tl");
      }
}

// lvl 3
class Dev3 extends Dev2 {
      public void loan() {
            System.out.println("çekilen kredi--" + 100000 + "tl");
      }

      public void account() {
            System.out.println("bakiyeniz--" + 200000 + "tl");
      }
}