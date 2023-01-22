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
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      

            Person papa = new Person("Javier", 47, 'M');
            papa.printPerson();
            Person mama = new Person("Reyna", 48, 'F');
            mama.printPerson();
            Person hermano1 = new Person("Jose Javier", 21, 'M');
            hermano1.printPerson();
            Person hermano2 = new Person("Adair Anibal", 16, 'M');
            hermano2.printPerson();
            Person hermano3 = new Person("Saray", 17, 'F');
            hermano3.printPerson();
            Person hermano4 = new Person("Maria Isabel", 78, 'F');
            hermano4.printPerson();
       
        
        
    }
    
}
