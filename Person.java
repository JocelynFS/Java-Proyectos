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
public class Person {
    String nombre;
    int edad;
    char sexo;
    //Metodo constructor
    public Person(String nombre,int edad,char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    //Metodo para imprimir
   void printPerson(){
            System.out.println("Nombre: " + nombre + " Edad: " + edad + " Sexo: " + sexo); 
    }
    
}
