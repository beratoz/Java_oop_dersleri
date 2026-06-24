/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.interface_gamesimulation;

public class Interface_GameSimulation {

    public static void main(String[] args) {

        // Karakterler oluşturuluyor
        OyunKarakteri savasci = new Savasci("Thorin", 150, 25, 15);
        OyunKarakteri buyucu = new Buyucu("Gandalf", 100, 30, 20);
        OyunKarakteri sifaci = new Sifaci("Elrond", 120, 35);

        // Karakterlerin durumlarını göster
        savasci.durumGoster();
        buyucu.durumGoster();
        sifaci.durumGoster();

        System.out.println("-----");

        // Karakterlerin yeteneklerini çalıştır
        savasci.ozelYetenek();
        ((Saldirabilir) savasci).saldir();
        ((Savunabilir) savasci).savun();

        System.out.println("-----");

        buyucu.ozelYetenek();
        ((Saldirabilir) buyucu).saldir();
        ((SifaVerebilir) buyucu).sifaVer();
        buyucu.durumGoster();

        System.out.println("-----");

        sifaci.ozelYetenek();
        ((SifaVerebilir) sifaci).sifaVer();
        sifaci.durumGoster();

    }
}




// Bir yetenek: Saldırı
interface Saldirabilir {
    void saldir();
    int saldiriGucu();
}

// Bir yetenek: Savunma
interface Savunabilir {
    void savun();
    int savunmaGucu();
}

// Bir yetenek: Şifa
interface SifaVerebilir {
    void sifaVer();
    int sifaGucu();
}

// Soyut sınıf: Oyun karakteri (temel özellikler ve metotlar)
abstract class OyunKarakteri {
    protected String ad;
    protected int saglik;

    public OyunKarakteri(String ad, int saglik) {
        this.ad = ad;
        this.saglik = saglik;
    }

    public void durumGoster() {
        System.out.println(ad + " - Sağlık: " + saglik);
    }

    public abstract void ozelYetenek(); // Her karakter kendine özgü bir yeteneğe sahip
}

// Alt sınıf: Savaşçı
class Savasci extends OyunKarakteri implements Saldirabilir, Savunabilir {
    private int saldiriGucu;
    private int savunmaGucu;

    public Savasci(String ad, int saglik, int saldiriGucu, int savunmaGucu) {
        super(ad, saglik);
        this.saldiriGucu = saldiriGucu;
        this.savunmaGucu = savunmaGucu;
    }

    @Override
    public void saldir() {
        System.out.println(ad + " kılıcını sallıyor! Saldırı gücü: " + saldiriGucu);
    }

    @Override
    public int saldiriGucu() {
        return saldiriGucu;
    }

    @Override
    public void savun() {
        System.out.println(ad + " kalkanını kaldırıyor! Gelen hasarı " + savunmaGucu + " azaltıyor.");
    }

    @Override
    public int savunmaGucu() {
        return savunmaGucu;
    }

    @Override
    public void ozelYetenek() {
        System.out.println(ad + " Öfke Modu'na geçiyor! Saldırı gücü bir tur için iki katına çıkıyor!");
    }
}

// Alt sınıf: Büyücü
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
        System.out.println(ad + " bir ateş topu gönderiyor! Büyü gücü: " + buyuGucu);
    }

    @Override
    public int saldiriGucu() {
        return buyuGucu;
    }

    @Override
    public void sifaVer() {
        System.out.println(ad + " bir iyileştirme büyüsü yapıyor! " + sifaGucu + " sağlık iyileştirildi.");
        saglik += sifaGucu;
    }

    @Override
    public int sifaGucu() {
        return sifaGucu;
    }

    @Override
    public void ozelYetenek() {
        System.out.println(ad + " Büyü Kalkanı oluşturuyor! Gelen tüm hasarı bir tur boyunca engelliyor.");
    }
}

// Alt sınıf: Şifacı
class Sifaci extends OyunKarakteri implements SifaVerebilir {
    private int sifaGucu;

    public Sifaci(String ad, int saglik, int sifaGucu) {
        super(ad, saglik);
        this.sifaGucu = sifaGucu;
    }

    @Override
    public void sifaVer() {
        System.out.println(ad + " kutsal bir dua okuyor! " + sifaGucu + " sağlık iyileştirildi.");
        saglik += sifaGucu;
    }

    @Override
    public int sifaGucu() {
        return sifaGucu;
    }

    @Override
    public void ozelYetenek() {
        System.out.println(ad + " İlahi Işık çağırıyor! Tüm müttefiklere iki kat iyileştirme sağlar.");
    }
}


