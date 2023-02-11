package edu.craptocraft.business;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



public class CreditCardTest {
    

    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");

    @Test public void ConstructorTest(){

        assertNotNull(this.abradolph);
        assertEquals(3000.0, this.abradolph.credit(), 0);
    }

    @Test public void toStringTest(){

        String result =  "owner:\tAbradolph Lincler\nnumber:\t4916119711304546\ncredit:\t3000.0EZI";
        assertEquals(result, this.abradolph.toString());
    }



}
