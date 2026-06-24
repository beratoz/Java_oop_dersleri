/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesoru2;

import java.time.LocalDate;

/**
 *
 * @author arisoy
 */
public class Arac {

    public String adsoyad;
    public int hgsno;
    public String aracsinif;
    public LocalDate gectigiTarih;

    public Arac(String adsoyad, int hgsno, String aracsinif, LocalDate gectigiTarih) {
        this.adsoyad = adsoyad;
        this.hgsno = hgsno;
        this.aracsinif = aracsinif;
        this.gectigiTarih = gectigiTarih;

    }

    public int getOdeme(Arac arac) {
        
        return 500;
    }

}

class Otomobil extends Arac {

    public int bakiye;

    public Otomobil(String adsoyad, int hgsno, String aracsinif, LocalDate gectigiTarih, int bakiye) {
        super(adsoyad, hgsno, aracsinif, gectigiTarih);
        this.bakiye = bakiye;
    }

    @Override
    public int getOdeme(Arac arac) {
        System.out.println("Otomobil sınıfı ödemesi "+gectigiTarih+" tarihinde: ");
        int odenecektutar=super.getOdeme(arac) + 20;
        this.bakiye-=odenecektutar;
        return odenecektutar;
    }
    
    public int getBakiye()
    {
        return this.bakiye;
    
    }

}

class Minibus extends Arac {

    public int bakiye;

    public Minibus(String adsoyad, int hgsno, String aracsinif, LocalDate gectigiTarih, int bakiye) {
        super(adsoyad, hgsno, aracsinif, gectigiTarih);
        this.bakiye = bakiye;
    }
    
     @Override
    public int getOdeme(Arac arac) {
        System.out.println("Minübüs sınıfı ödemesi "+gectigiTarih+" tarihinde: ");
        int odenecektutar=super.getOdeme(arac) + 30;
        this.bakiye-=odenecektutar;
        return odenecektutar;
    }
    
      
    public int getBakiye()
    {
        return this.bakiye;
    
    }


}

class Otobus extends Arac {

    public int bakiye;

    public Otobus(String adsoyad, int hgsno, String aracsinif, LocalDate gectigiTarih, int bakiye) {
        super(adsoyad, hgsno, aracsinif, gectigiTarih);
        this.bakiye = bakiye;
    }
    
     @Override
    public int getOdeme(Arac arac) {
        System.out.println("Otobüs sınıfı ödemesi "+gectigiTarih+" tarihinde: ");
        int odenecektutar=super.getOdeme(arac) + 40;
        this.bakiye-=odenecektutar;
        return odenecektutar;
    }
    
     
    public int getBakiye()
    {
        return this.bakiye;
    
    }


}
