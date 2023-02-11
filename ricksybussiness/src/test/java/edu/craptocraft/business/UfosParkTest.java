package edu.craptocraft.business;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;




public class UfosParkTest {

    
    UfosPark ufospark = new UfosPark();

    @Before public void intialize(){
        this.ufospark.add("unx");
        this.ufospark.add("dox");
    }


    @Test public void getFlotaSizeTest(){
    
       assertEquals(2, this.ufospark.getFlotaSize());

    }





}
