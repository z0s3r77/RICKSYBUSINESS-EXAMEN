package edu.craptocraft.business;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



public class CreditCardTest {
    

    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");

    // Inicializamos abradolph
    @Test public void ConstructorTest(){

        assertNotNull(this.abradolph);

    }

    @Test public void toStringTest(){

        String result =  "owner:\tAbradolph Lincler\nnumber:\t4916119711304546\ncredit:\t3000.0EZI";
        assertEquals(result, this.abradolph.toString());
    }



}
