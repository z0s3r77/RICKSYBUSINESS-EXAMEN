package edu.craptocraft.business;

import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher{

    private final Map<String, String> flota = new HashMap<>();

    public UfosPark(){}

    public void add(String ovni){
        this.flota.put(ovni, null);
    }


    public int getFlotaSize(){
        return this.flota.size();
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        // TODO Auto-generated method stub
        
    }
    
}
