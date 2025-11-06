/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.itszn.primerprogramamaven;

/**
 *
 * @author Darre
 */
public class App {

    public static void main(String[] args) {
        Calculos mCal = new Calculos();
        
        System.out.println("Suma entre 2 y 4 " + mCal.sumarSerie(2, 4));
        
        System.out.println("Absoluto de -3 " + mCal.absoluto(-3));
        
        System.out.println("Vocales de 'murcielago' " + mCal.vocales("murcielago"));
        
        System.out.println("Invertir de 'hola mundo' " + mCal.invertir("hola mundo"));
        
    }
}
