enum UrunKategorisi {
      ELEKTRONİK, GİYİM, GIDA;

}

abstract class Kategori {
      private String urunadi;
      private double fiyat;
      private UrunKategorisi urun_kategori;

      Kategori(String urunadi, double fiyat, UrunKategorisi urun_kategori) {
            this.fiyat = fiyat;
            this.urunadi = urunadi;
            this.urun_kategori = urun_kategori;
      }

      public UrunKategorisi getKategori() {
            return urun_kategori;
      }

      public abstract double indirimHesapla();
}

class Elektronik extends Kategori {
      private double teknolojiVergisi;

      Elektronik(String urunadi, double fiyar, double teknolojiVergisi) {
            super(urunadi, fiyar, UrunKategorisi.ELEKTRONİK);
            this.teknolojiVergisi = teknolojiVergisi;

      }

      @Override
      public double indirimHesapla() {
            return getFiyat() - (getFiyat() * 0.10) + teknolojiVergisi;
      }
}

class Giyim extends Kategori {
      private double sezonİndirimi;

      Giyim(String urunAdi, double fiyar, double sezonİndirimi) {
            super(urunAdi, fiyar, UrunKategorisi.GİYİM);
            this.sezonİndirimi = sezonİndirimi;

      }

      @Override
      public double indirimHesapla() {
            return getFiyat() - (getFiyat() * 0.20) - sezonİndirimi;
      }
}

public class test_enum_urun {
      public static void main(String[] args) {
            Elektronik elk = new Elektronik("laptop", 35000, 5000);
            Kategori gym = new Giyim("ceket", 5000, 3000);
            System.out.println("urun kategorisi" + elk.getKategori());
            System.out.println("urun adi" + elk.getUrunadi());
            System.out.println("indirim hesapla" + elk.indirimHesapla());
            System.out.println("urun kategorisi" + gym.getKategori());
            System.out.println("urun adi" + gym.getUrunadi());
            System.out.println("indirim hesapla" + gym.indirimHesapla());

      }
}
