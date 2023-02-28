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
 * @author Mathias
 */
public class InterfazIT {
    
    public InterfazIT() {
    }
    
   
    
    
    /**
     * Test de la función getIconImage method, de la clase Interfaz.
     * 
     */
    @Test
    public void testGetIconImage() {
        Interfaz interfaz = new Interfaz();
        Image expResult = interfaz.getIconImage();
        Image result = interfaz.getIconImage();
        assertEquals(expResult, result);
        
    }

    /**
     * Test de la función main, de la clase Interfaz.
     */
    @Test
    public void testMain() {
        String[] args = null;
        Interfaz.main(args);
       
    }
    
}