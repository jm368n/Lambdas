/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import javax.swing.plaf.OptionPaneUI;
import org.junit.Test;

/**
 *
 * @author Cisco
 */
public class Testoperaciones {
    
    @Test
    public static void testOperaciones()
    {
        operacion op = new operacion();
        int resultado = op.suma(5,4);
        System.out.println("testOperaciones SUMA : " + resultado);
                
        //Assert.assertEquals(9,resultado);
    }
    
    public static void main(String[] args) {
        
       // testOperaciones top= new testOperaciones();
       
        operacion ope= new operacion();
        int sum = ope.suma(6, 5);
        System.out.println("suma = " + sum);
        
        
        Testoperaciones.testOperaciones();
        
    }
       
    }

