public class this_kullanimi {

      int i = 5;
      static double k = 0;

      this_kullanimi(int i) {
            this.i = i;

      }

      this_kullanimi() {
            this(3);
      }

      void setIValue(int i) {
            this.i = i;
      }

      void setKValue(double k) {
            this_kullanimi.k = k;
      }

      public static void main(String[] args) {
            this_kullanimi t1 = new this_kullanimi();
            this_kullanimi t2 = new this_kullanimi();
            t1.setIValue(7);
            t2.setIValue(6);
            t1.setKValue(34);
            t2.setKValue(12);
            System.out.println("t1 icin i degeri" + t1.i);
            System.out.println("t1 icin k degeri" + this_kullanimi.k);
            System.out.println("t1 icin i degeri" + t2.i);
            System.out.println("t1 icin k degeri" + this_kullanimi.k);
      }
}