/**
 * 
 * @author arisoy
 */
public class gpt_test_course {

      // Sınıf değişkenleri ve metotları main'in dışında olmalıdır
      private String kursAdi;
      private String[] ogrenciler = new String[100];
      private int ogrenciSayisi;

      // Yapıcı metodun ismi sınıf ismiyle aynı olmalı
      public gpt_test_course(String kursAdi) {
            this.kursAdi = kursAdi;
      }

      public void ogrenciEkle(String ogrenci) {
            if (ogrenciSayisi < ogrenciler.length) {
                  ogrenciler[ogrenciSayisi] = ogrenci;
                  ogrenciSayisi++;
            } else {
                  System.out.println("Kurs dolu, öğrenci eklenemiyor.");
            }
      }

      public String[] ogrencileriGetir() {
            String[] aktifOgrenciler = new String[ogrenciSayisi];
            for (int i = 0; i < ogrenciSayisi; i++) {
                  aktifOgrenciler[i] = ogrenciler[i];
            }
            return aktifOgrenciler;
      }

      public int ogrenciSayisiniGetir() {
            return ogrenciSayisi;
      }

      public String kursAdiGetir() {
            return kursAdi;
      }

      public void ogrenciSil(String silinecekOgrenci) {
            int silinecekOgrenciIndex = -1;

            // Öğrenciyi bul
            for (int i = 0; i < ogrenciSayisi; i++) {
                  if (ogrenciler[i].equals(silinecekOgrenci)) {
                        silinecekOgrenciIndex = i;
                        break;
                  }
            }

            // Öğrenci bulunduysa sil
            if (silinecekOgrenciIndex != -1) {
                  for (int i = silinecekOgrenciIndex; i < ogrenciSayisi - 1; i++) {
                        ogrenciler[i] = ogrenciler[i + 1];
                  }
                  ogrenciler[ogrenciSayisi - 1] = null;
                  ogrenciSayisi--;
            } else {
                  System.out.println("Öğrenci bulunamadı.");
            }
      }

      // Main metodunu sınıfın dışında bırakın
      public static void main(String[] args) {
            gpt_test_course kurs = new gpt_test_course("Java Kursu");
            kurs.ogrenciEkle("Ahmet");
            kurs.ogrenciEkle("Ayşe");

            System.out.println("Kurs Adı: " + kurs.kursAdiGetir());
            System.out.println("Öğrenci Sayısı: " + kurs.ogrenciSayisiniGetir());

            String[] ogrenciler = kurs.ogrencileriGetir();
            System.out.println("Kursa kayıtlı öğrenciler:");
            for (String ogrenci : ogrenciler) {
                  System.out.println(ogrenci);
            }

            kurs.ogrenciSil("Ahmet");
            System.out.println("Ahmet silindikten sonra kalan öğrenciler:");
            ogrenciler = kurs.ogrencileriGetir();
            for (String ogrenci : ogrenciler) {
                  System.out.println(ogrenci);
            }
      }
}
