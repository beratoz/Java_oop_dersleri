
/**
 *
 * @author arisoy
 */
public class Course {

    private String kursAdi;
    private String[] ogrenciler = new String[100];
    private int ogrenciSayisi;

    public Course(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public void ogrenciEkle(String ogrenci) {
        ogrenciler[ogrenciSayisi] = ogrenci;
        ogrenciSayisi++;

    }

    public String[] ogrencileriGetir() {
        return ogrenciler;
    }

    public int ogrenciSayisiniGetir() {
        return ogrenciSayisi;
    }

    public String kursAdiGetir() {

        return kursAdi;

    }

    public String[] ogrenciSil(String silinecekOgrenci)// bu sayede listenin başından, ortasından ve sonundan eleman
                                                       // silebiliriz
    {
        String[] temp = new String[ogrenciler.length - 1];
        int silinecekOgrenciIndex = 0;

        for (int i = 0; i < ogrenciler.length; i++) {
            if (ogrenciler[i] == silinecekOgrenci) {
                silinecekOgrenciIndex = i;
                break;
            }

        }

        for (int i = 0, k = 0; i < ogrenciler.length; i++) {
            if (i != silinecekOgrenciIndex) {
                temp[k] = ogrenciler[i];
                k++;
            }
        }
        ogrenciler = new String[temp.length];
        ogrenciler = temp;

        return ogrenciler;
    }

}

public class Course {
    private String kursAdi;
    private String[] ogrenciler = new String[100];
    private int ogrenciSayisi;

    public Course(String var1) {
        this.kursAdi = var1;
    }

    public void ogrenciEkle(String var1) {
        this.ogrenciler[this.ogrenciSayisi] = var1;
        ++this.ogrenciSayisi;
    }

    public String[] ogrencileriGetir() {
        return this.ogrenciler;
    }

    public int ogrenciSayisiniGetir() {
        return this.ogrenciSayisi;
    }

    public String kursAdiGetir() {
        return this.kursAdi;
    }

    public String[] ogrenciSil(String var1) {
        String[] var2 = new String[this.ogrenciler.length - 1];
        int var3 = 0;

        int var4;
        for (var4 = 0; var4 < this.ogrenciler.length; ++var4) {
            if (this.ogrenciler[var4] == var1) {
                var3 = var4;
                break;
            }
        }

        var4 = 0;

        for (int var5 = 0; var4 < this.ogrenciler.length; ++var4) {
            if (var4 != var3) {
                var2[var5] = this.ogrenciler[var4];
                ++var5;
            }
        }

        this.ogrenciler = new String[var2.length];
        this.ogrenciler = var2;
        return this.ogrenciler;
    }
}
