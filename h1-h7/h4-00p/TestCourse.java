
public class TestCourse {

    public static void main(String[] args) {

        Course c1 = new Course("Nesneye Dayalı Programlama");
        Course c2 = new Course("Bilişim Sistemlerinin Analizi ver Tasarımı");

        c1.ogrenciEkle("Ali Al");
        c1.ogrenciEkle("Veli Gel");
        c1.ogrenciEkle("Ayşe Solmaz");

        c2.ogrenciEkle("Aylin Getir");
        c2.ogrenciEkle("Pınar Taşır");
        c2.ogrenciEkle("Gökhan Okur");

        System.out.println("c1 nesnesi öğrenci sayısı: " + c1.ogrenciSayisiniGetir());

        String[] tumOgrenciler = c1.ogrencileriGetir();

        for (int i = 0; i < tumOgrenciler.length; i++) {
            System.out.print(tumOgrenciler[i] + ", ");
        }

        System.out.println();

        System.out.println("c2 nesnesi öğrenci sayısı: " + c2.ogrenciSayisiniGetir());

        String[] yeniOgrenciler = c2.ogrenciSil("Gökhan Okur");

        for (int i = 0; i < yeniOgrenciler.length; i++) {
            System.out.println("c2 nesnesi " + yeniOgrenciler[i]);
        }

    }
}
