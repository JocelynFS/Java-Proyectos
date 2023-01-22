/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author jocelyn.francisco.s1
 */
public class Cast {
    public static void main(String[] args) {
        //Casteo automatico, mas pequeño a mas grande
        char c = 'z';
        int cI = c;
        System.out.println(cI);//122 ASCI
        int i = 250;
        long iN = i;
        System.out.println(iN);//250
        //Casteo explicito, casteo grande a pequeño
        short iNN = (short) iN;
        System.out.println(iNN);//250
        //Casteo explicito, casteo grande a pequeño
        double d = 301.067;
        long dI =(long) d;//301
        System.out.println(dI);
        //Casteo explicito, casteo grande a pequeño
        int a = 100 ;
        System.out.println((float) a + 5000.66);//5100.66 
        //Casteo explicito, casteo grande a pequeño
        int i2 = 737;
        i2 =i2 * 100;
        byte i3 = (byte) i2;
        System.out.println(i3);//-28
        //Casteo explicito, casteo grande a pequeño
        double d1 = 298.638;
        d1 = d1/25;
        long d2 =(long) d1;
        System.out.println(d2);//11
    }
    
    
}
