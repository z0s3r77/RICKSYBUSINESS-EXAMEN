package edu.craptocraft.business;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;




public class UfosParkTest {

    
    UfosPark ufospark = new UfosPark();
    CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");


    @Before public void intialize(){
        this.ufospark.add("unx");
        this.ufospark.add("dox");
    }


    @Test public void getFlotaSizeTest(){

       assertEquals(2, this.ufospark.getFlotaSize());
    
    }

    @Test public void dispatchTest(){

        this.ufospark.dispatch(this.abradolph);

        //Después de un dispatch
        assertEquals(2500.0, abradolph.credit(), 0);

    }

    @Test public void getUfoOfTest(){

        this.ufospark.dispatch(this.abradolph);        
        assertEquals("dox", this.ufospark.getUfoOf("4916119711304546"));

    }


    @Test public void userWantsAnotherUfoTest(){

        // El usuario pide dos Ufos

        this.ufospark.dispatch(this.abradolph);        
        this.ufospark.dispatch(this.abradolph);
        
        assertEquals(2500.0, abradolph.credit(), 0);
    }

}
