
public class okul_yonetim_sistemi {
      public static void main(String[] args) {
            Personel[] per = new Personel[2];
            Ogretmen ogretmen = new Ogretmen("alis yalcin", 42, "matematik");
            IdariPersonel idari = new IdariPersonel("yasemin", 45, "muhasabel");

            per[0] = ogretmen;
            per[1] = idari;

            for (Personel p : per) {
                  p.bilgiGoster();
                  p.dersVer();
                  p.dersVer("fen");
                  System.out.println("**************************");
            }

      }

}

class Personel {
      String isim;
      int yas;

      public Personel(String isim, int yas) {
            this.isim = isim;
            this.yas = yas;

      }

      public void bilgiGoster() {
            System.out.println("personel bilgi ismi" + isim + " yas" + yas);
      }

      public void dersVer() {

      }

      public void dersVer(String ders) {

      }

}

class Ogretmen extends Personel {
      String brans;

      public Ogretmen(String isim, int yas, String brans) {
            super(isim, yas);
            this.brans = brans;
      }

      @Override
      public void bilgiGoster() {
            System.out.println("ogretmene ait bilgi sistemi" + isim + " yas" + yas + "brans" + brans);
      }

      public void dersVer() {
            System.out.println(isim + "ders veriyor");
      }

      public void dersVer(String ders) {
            System.out.println(isim + " " + ders + "dersini veriyor");
      }

}

class IdariPersonel extends Personel {
      String departman;

      public IdariPersonel(String isim, int yas, String departman) {
            super(isim, yas);
            this.departman = departman;

      }

      @Override
      public void bilgiGoster() {
            System.out.println("idari personel bilgi sistemi" + isim + "-yas" + yas + "-departman " + departman);
      }
}