/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author LAB F
 */
public class JavaApplication1 {

    
        public void luas(int s) {
            int hasil = s* s;
            System.out.println("hasil persegi " + hasil);
        
        }
        
        public void luas(int p, int l) {
            int hasil = p * l;
            System.out.println("hasil persegi panajnng " + hasil);
        }
}

class tampil{
    public static void main(String[] args) {
       JavaApplication1 bangun = new JavaApplication1();
       bangun.luas(10);
       bangun.luas(10,5);
       
       persegi per = new persegi();
       per.sisi= 2;
       per.luas();
       per.sisi= 10;
       per.luas();
       
       persegipanjang panjang = new persegipanjang();
       panjang.p = 8;
       panjang.l = 4;
       panjang.luas();
       
      
        
        
    }
}

class persegi {
    int sisi;
    public void luas(){
        int hasil = sisi*sisi;
        System.out.println("hasil persegi =" + hasil);
    }
}

class persegipanjang extends persegi {
    int p;
    int l;
    @Override
    public void luas(){
        int hasil = p*l;
        System.out.println("hasil persegi panjang =" + hasil);
    }
}

