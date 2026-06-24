enum YemekTuru {
      PIZZA(50), BURGER(40), SALATA(20), MAKARNA(30);

      private final int fiyat;

      YemekTuru(int fiyat) {
            this.fiyat = fiyat;
      }

      public int getFiyat() {
            return fiyat;
      }
}

class Yemek {
      private YemekTuru yemekturu;

      Yemek(YemekTuru yemekturu) {
            this.yemekturu = yemekturu;
      }

      public int fiyatHesapla() {
            return yemekturu.getFiyat();
      }
}

public class test_enum {
      public static void main(String[] args) {
            Yemek yy = new Yemek(YemekTuru.PIZZA);
            System.out.println("yemekturu" + YemekTuru.PIZZA);
            System.out.println("odebnesş gereken hesap ucreti::" + yy.fiyatHesapla());

            Yemek siparis = new Yemek(YemekTuru.SALATA);
            System.out.println("seçilen yemek" + YemekTuru.SALATA);
            System.out.println("odenmesi gereken hesap ucreti" + siparis.fiyatHesapla());

      }
}
