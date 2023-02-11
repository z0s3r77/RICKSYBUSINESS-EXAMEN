package edu.craptocraft.business;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CrystalExpenderTest {
    
    CrystalExpender packExpender = new CrystalExpender(3, 50);
 
    @Test public void constructorTest(){

        assertEquals( 3, this.packExpender.stock());
    
    }

    

}
