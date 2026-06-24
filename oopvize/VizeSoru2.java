/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.vizesoru2;

import java.time.LocalDate;

public class VizeSoru2 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        Otomobil otomobil = new Otomobil("Ali Yılmaz", 12345, "otomobil", date, 800);
        Minibus minibus = new Minibus("Tarık Kaynarca", 34567, "minübüs", date, 900);
        Otobus otobus = new Otobus("Rıfat Kaya", 11234, "otobüs", date, 1000);

        System.out.println(otomobil.getOdeme(otomobil));
        System.out.println(minibus.getOdeme(minibus));
        System.out.println(otobus.getOdeme(otobus));

        System.out.println("otomobil kalan bakiye: " + otomobil.getBakiye());
        System.out.println("minibus kalan bakiye: " + minibus.getBakiye());
        System.out.println("otobus kalan bakiye: " + otobus.getBakiye());

    }
}
