/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.itszn.primerprogramamaven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Darre
 */
public class CalculosTest {
    
    Calculos instance = new Calculos();
    
    public CalculosTest() {
    }

   
    /**
     * Test of sumarSerie method, of class Calculos.
     */
    @Test
    public void testSumarSerie1() {
        System.out.println("sumarSerie probado el 2 al 4");
        int x = 2;
        int y = 4;
        int expResult = 9;
        int result = instance.sumarSerie(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumarSerie2() {
        System.out.println("sumarSerie probado del 0 al 5");
        int x = 0;
        int y = 5;
        int expResult = 15;
        int result = instance.sumarSerie(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumarSerie3() {
        System.out.println("sumarSerie probado del 5 al 0");
        int x = 5;
        int y = 0;
        int expResult = 15;
        int result = instance.sumarSerie(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testSumarSerie4() {
        System.out.println("sumarSerie probado del 1 al 1");
        int x = 1;
        int y = 1;
        int expResult = 1;
        int result = instance.sumarSerie(x, y);
        assertEquals(expResult, result);
    }


    /**
     * Test of absoluto method, of class Calculos.
     */
    @Test
    public void testAbsoluto1() {
        System.out.println("absoluto probando 0");
        float num = 0.0F;
        float expResult = 0.0F;
        float result = instance.absoluto(num);
        assertEquals(expResult, result, 0);

    }

    @Test
    public void testAbsoluto2() {
        System.out.println("absoluto probado -1");
        float num = -1.0F;
        float expResult = 1.0F;
        float result = instance.absoluto(num);
        assertEquals(expResult, result, 0);

    }

    @Test
    public void testAbsoluto3() {
        System.out.println("absoluto probado 3");
        float num = 3.0F;
        float expResult = 3.0F;
        float result = instance.absoluto(num);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of vocales method, of class Calculos.
     */
    @Test
    public void testVocales1() {
        System.out.println("vocales probado 'murcielago'");
        String texto = "murcielago";
        int expResult = 5;
        int result = instance.vocales(texto);
        assertEquals(expResult, result);

    }

    @Test
    public void testVocales2() {
        System.out.println("vocales probado 'trrs'");
        String texto = "trrs";
        int expResult = 0;
        int result = instance.vocales(texto);
        assertEquals(expResult, result);

    }

    @Test
    public void testVocales3() {
        System.out.println("vocales probado sin letras");
        String texto = "";
        int expResult = 0;
        int result = instance.vocales(texto);
        assertEquals(expResult, result);

    }

    @Test
    public void testVocales4() {
        System.out.println("vocales probado NULL");
        String texto = null;
        int expResult = 0;
        int result = instance.vocales(texto);
        assertEquals(expResult, result);

    }

    /**
     * Test of invertir method, of class Calculos.
     */
    @Test
    public void testInvertir1() {
        System.out.println("invertir probado 'hola mundo'");
        String texto = "hola mundo";
        String expResult = "aloh odnum";
        String result = instance.invertir(texto);
        assertEquals(expResult, result);

    }

    @Test
    public void testInvertir2() {
        System.out.println("invertir probado sin letras");
        String texto = "";
        String expResult = "";
        String result = instance.invertir(texto);
        assertEquals(expResult, result);

    }

    @Test
    public void testInvertir3() {
        System.out.println("invertir probado NULL");
        String texto = null;
        String result = instance.invertir(texto);
        assertNull(result);

    }

    @Test
    public void testInvertir4() {
        System.out.println("invertir probado 'hola - todos'");
        String texto = "hola - todos";
        String expResult = "aloh - sodot";
        String result = instance.invertir(texto);
        assertEquals(expResult, result);

    }

    
}
