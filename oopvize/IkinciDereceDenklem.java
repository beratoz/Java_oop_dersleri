/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vizesoru1;

/**
 *
 * @author arisoy
 */
public class IkinciDereceDenklem {
    
    
    private int a,b,c;
    double sonuc;
    
    public double kok1,kok2;
  
    public IkinciDereceDenklem(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
     public IkinciDereceDenklem(double kok1,double kok2)
    {
        this.kok1=kok1;
        this.kok2=kok2;        
    }
     
     public double getKok1()
     {
         return kok1;
     }
     
       public double getKok2()
     {
         return kok2;
     }
     
    
    public int getA()
    {
        return a;
    }
    
    public int getB()
    {
        return b;
    }
    
    public int getC()
    {
        return c;
    }
    
    public double getDiskrimant() 
    {
        double sonuc=Math.pow(b, 2)-(4*a*c);
        this.sonuc=sonuc;
        return sonuc;
    }
    
    
    public IkinciDereceDenklem kokAta() 
    {    
        double kok1=(-b+ Math.sqrt(this.sonuc))/2*a;
        double kok2= (-b- Math.sqrt(this.sonuc))/2*a;
       
        return new   IkinciDereceDenklem(kok1,kok2);
    }
}
