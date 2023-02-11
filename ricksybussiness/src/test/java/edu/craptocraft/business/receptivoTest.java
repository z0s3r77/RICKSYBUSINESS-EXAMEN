package edu.craptocraft.business;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;


public class receptivoTest {
    
    Receptivo receptivo = new Receptivo();
    CrystalExpender packExpender = new CrystalExpender(3,50);
    UfosPark ufosPark = new UfosPark();



    @Before public void registrarTest(){


    String[] ufosID = { "unx", "dox", "trex" };
        for (String ovni : ufosID) {
            this.ufosPark.add(ovni);
    }

    this.receptivo.registra(packExpender);
    this.receptivo.registra(ufosPark);
    }

    @Test public void registrosReceptivo(){

        assertEquals(2, this.receptivo.getDispatchers());

    }

}
