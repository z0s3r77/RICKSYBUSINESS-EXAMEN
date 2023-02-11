package edu.craptocraft.business;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CrystalExpenderTest {
    
    CrystalExpender packExpender = new CrystalExpender(3, 50);
    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");

 
    @Test public void constructorTest(){

        assertEquals( 3, this.packExpender.stock());
    
    }

    @Test public void toStringTest(){

        String result = "stock:\t"+this.packExpender.stock()+"\ncost:\t"+this.packExpender.itemCost();
        assertEquals(result, this.packExpender.toString());

    }

    @Test public void dispatchTest(){
        this.packExpender.dispatch(abradolph);
        assertEquals(2950.0, abradolph.credit(),0);
    }


}
