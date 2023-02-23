/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Ventanas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLabel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathias
 */
public class Interfaz2Test {
    
    public Interfaz2Test() {
    }

    /**
     * Test of getIconImage method, of class Interfaz2.
     */
    @Test
    public void testGetIconImage() {
        Interfaz2 ventana2 = new Interfaz2();
        Image expResult = ventana2.getIconImage();
        Image result = ventana2.getIconImage();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of main method, of class Interfaz2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Interfaz2.main(args);
       
    }

    /**
     * Test of calcularResto method, of class Interfaz2.
     */
    @Test
    public void testCalcularResto() {
        
        Interfaz2 ventana2 = new Interfaz2();
        ventana2.calcularResto();
        
    }

    /**
     * Test of mostrarImagen method, of class Interfaz2.
     */
 
 
    
}
