package edu.craptocraft.business;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class UfosPark implements GuestDispatcher{

    private final Map<String, String> flota = new HashMap<>();

    public UfosPark(){}

    public void add(String ovni){
        this.flota.put(ovni, null);
    }


    public int getFlotaSize(){
        return this.flota.size();
    }

    public String getUfoOf(String creditCardNumber){
        
        Optional<String> onviOcupado = this.flota.entrySet().stream()
                                                            .filter(ovni -> ovni.getValue() == creditCardNumber)
                                                            .map(Entry::getKey)
                                                            .findFirst();
                                                            
        return onviOcupado.isPresent() ? onviOcupado.get() : "No tiene ovni assignado";
                                                    


    }

    @Override
    public void dispatch(CreditCard creditCard) {

        Optional<String> ovniLibre = this.flota.entrySet().stream().filter(ovnis -> ovnis.getValue() == null).map(Entry::getKey).findFirst();
        
        if (ovniLibre.isPresent()) {
            
            if(creditCard.pay(500)){
                this.flota.put(ovniLibre.get(), creditCard.number());
            } else {
                System.out.println(creditCard.cardOwner() + "\t no tiene creditos suficientes");
            }

        } else {
            System.out.println("No hay ovnis libres");
        }

    }
    
}
