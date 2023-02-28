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
public class Interfaz2IT {
    
    public Interfaz2IT() {
    }

    /**
     * Test of getIconImage method, of class Interfaz2.
     */
    @Test
    public void testGetIconImage() {
     
        Interfaz2 instance = new Interfaz2();
        Image expResult = instance.getIconImage();
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of main method, of class Interfaz2.
     */
    @Test
    public void testMain() {
        
        String[] args = null;
        Interfaz2.main(args);
       
    }

   
    

    
}
