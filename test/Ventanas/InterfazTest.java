/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Ventanas;

import java.awt.Image;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathias
 */
public class InterfazTest {
    
    public InterfazTest() {
    }

    /**
     * Test of getIconImage method, of class Interfaz.
     */
    @Test
    public void testGetIconImage() {
        
        Interfaz ventana1 = new Interfaz();
        Image esperado = ventana1.getIconImage();
        Image resultado = ventana1.getIconImage();
        assertEquals(esperado, resultado);
        
    }

    /**
     * Test of main method, of class Interfaz.
     */
    @Test
    public void testMain() {
        Interfaz ventana1 = new Interfaz();
        
      
        
    }
    
}
