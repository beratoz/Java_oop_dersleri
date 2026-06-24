/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vizesoru1;
import java.util.Scanner;

/**
 *
 * @author arisoy
 */
public class VizeSoru1 {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Sırasıyla denklemin a, b ve c değerlerini pozitif yada negatif giriniz: ");
        
        int a =s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();
        
   
        
        IkinciDereceDenklem ikinci=new IkinciDereceDenklem(a,b,c);        
        double diskriminant =ikinci.getDiskrimant();
        System.out.println("denklemin diskriminantı: "+diskriminant);
        
        ikinci=ikinci.kokAta();
                
        if (diskriminant<0)
            System.out.println("eşitliğin kökü yoktur");
        else
            System.out.println("1.kök: "+ikinci.getKok1()+" 2.kök: "+ikinci.getKok2());
            
            
        System.out.println("eşitlik şu şekildedir: "+a+"x2"+"+"+b+"x"+"+"+c+"="+"0");
        
        
        
        
        
    }
}
