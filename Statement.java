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
public class Statement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;
        if(isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
            int i = 0;
            i++;
        }else{
            fileSended--;
            System.out.println("Por favor enciende tu bluetooth");         
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
        //System.out.println(i);//se está declarando fuera de su scope de alcance, marca error
    }
}
