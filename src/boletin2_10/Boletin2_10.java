/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long euros;
        long billetes100;
        long billetes20;
        long billetes5;
        long monedas;
        
        euros=Long.parseLong(JOptionPane.showInputDialog("euros"));
        
        billetes100= euros/100;
        billetes20=(euros%100)/20;
        billetes5=(euros%100%20)/5;
        monedas=(euros%100%20%5)/1;
        
     JOptionPane.showMessageDialog(null,("billetes: 100 = ")+ billetes100 + " ,20 = " +billetes20 + " ,5 = "+ billetes5 + " ,monedas = " + monedas) ;
        
                
                
    }
}
