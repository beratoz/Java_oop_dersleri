public class capsam_araligi {
      public static void main(String[] args) {
            Foo f = new Foo();

      }

}

class Foo {
      private int i;
      private int j = i + 2;

      private int x = 0;
      private int y = 0;

      Foo() {
            int x = 1;
            System.out.println("foo yapıcı metodu x degeri" + x);
            System.out.println("foo yapıcı degeri tarafından cagrilan y degeri" + y);
            System.out.println("foo yapıcı metodu icerisinden cagrilan x degeri" + this.x);
      }
}