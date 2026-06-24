// Saldırabilir interface'i
interface Saldirabilir {
      void saldir();

      int getSaldiriGucu();
}

// Savunabilir interface'i
interface Savunabilir {
      void savun();

      int getSavunmaGucu();
}

// Şifa Verebilir interface'i
interface SifaVerebilir {
      void sifaVer();

      int getSifaGucu();
}

// Abstract class: Oyun Karakteri
abstract class OyunKarakteri {
      protected String ad;
      protected int saglik;

      public OyunKarakteri(String ad, int saglik) {
            this.ad = ad;
            this.saglik = saglik;
      }

      public void durumGoster() {
            System.out.println("Ad: " + ad + ", Sağlık: " + saglik);
      }

      public abstract void ozelYetenek();
}

// Savaşçı sınıfı
class Savascı extends OyunKarakteri implements Saldirabilir, Savunabilir {
      private int saldiriGucu;
      private int savunmaGucu;

      public Savascı(String ad, int saglik, int saldiriGucu, int savunmaGucu) {
            super(ad, saglik);
            this.saldiriGucu = saldiriGucu;
            this.savunmaGucu = savunmaGucu;
      }

      @Override
      public void saldir() {
            System.out.println(ad + " saldırıyor! Saldırı gücü: " + saldiriGucu);
      }

      @Override
      public int getSaldiriGucu() {
            return saldiriGucu;
      }

      @Override
      public void savun() {
            System.out.println(ad + " savunma yapıyor! Savunma gücü: " + savunmaGucu);
      }

      @Override
      public int getSavunmaGucu() {
            return savunmaGucu;
      }

      @Override
      public void ozelYetenek() {
            System.out.println(ad + " özel bir hamle yapıyor: Kalkan Duvarı!");
      }
}

// Büyücü sınıfı
class Buyucu extends OyunKarakteri implements Saldirabilir, SifaVerebilir {
      private int buyuGucu;
      private int sifaGucu;

      public Buyucu(String ad, int saglik, int buyuGucu, int sifaGucu) {
            super(ad, saglik);
            this.buyuGucu = buyuGucu;
            this.sifaGucu = sifaGucu;
      }

      @Override
      public void saldir() {
            System.out.println(ad + " büyü saldırısı yapıyor! Büyü gücü: " + buyuGucu);
      }

      @Override
      public int getSaldiriGucu() {
            return buyuGucu;
      }

      @Override
      public void sifaVer() {
            System.out.println(ad + " şifa veriyor! Şifa gücü: " + sifaGucu);
      }

      @Override
      public int getSifaGucu() {
            return sifaGucu;
      }

      @Override
      public void ozelYetenek() {
            System.out.println(ad + " özel bir büyü yapıyor: Mana Patlaması!");
      }
}

// Ana sınıf
public class oyun_deneme {
      public static void main(String[] args) {
            // Savaşçı karakteri oluştur
            Savascı savasci = new Savascı("Kılıç Ustası", 100, 60, 50);
            savasci.durumGoster();
            savasci.saldir();
            savasci.savun();
            savasci.ozelYetenek();

            System.out.println();

            // Büyücü karakteri oluştur
            Buyucu buyucu = new Buyucu("Ateş Büyücüsü", 100, 30, 35);
            buyucu.durumGoster();
            buyucu.saldir();
            buyucu.sifaVer();
            buyucu.ozelYetenek();
      }
}
