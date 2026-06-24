public class oyun_deneme {
      public static void main(String[] args) {
            Savasci savasci = new Savasci("Savasci", 100, 50, 50);
            savasci.durumGoster();
            savasci.saldir();
      }
}

interface Saldirabilir {
      void saldir();

      int saldiriGucu();
}

interface Savunabilir {
      void savun();

      int savunmaGucu();
}

interface SifaVerebilir {
      void sifaVer();

      int sifaGucu();
}

abstract class Oyun_karakteri {
      protected String ad;
      protected int saglik;

      public Oyun_karakteri(String ad, int saglik) {
            this.ad = ad;
            this.saglik = saglik;
      }

      public void durumGoster() {
            System.out.println(ad + saglik);
      }

      public abstract void ozelYetenek();
}

class Savasci extends Oyun_karakteri implements Saldirabilir, Savunabilir {
      private int saldiriGucu;
      private int savunmaGucu;

      public Savasci(String ad, int saglik, int saldiriGucu, int savunmaGucu) {
            super(ad, saglik);
            this.saldiriGucu = saldiriGucu;
            this.savunmaGucu = savunmaGucu;
      }

      @Override
      public void saldir() {
            System.out.println(ad + "saldiriyor" + saldiriGucu);
      }

      @Override
      public int saldiriGucu() {
            return saldiriGucu;
      }

      @Override
      public void savun() {
            System.out.println(ad + "savunma yapiliyor" + savunmaGucu);
      }

      @Override
      public int savunmaGucu() {
            return savunmaGucu;
      }

      @Override
      public void ozelYetenek() {
            System.out.println(ad + "ozel yetenek");
      }
}