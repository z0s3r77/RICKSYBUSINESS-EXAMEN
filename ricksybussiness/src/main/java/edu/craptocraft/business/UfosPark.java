package edu.craptocraft.business;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

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
                                                            
        return onviOcupado.isPresent() ? onviOcupado.get() : null;
                                                    


    }

    @Override
    public void dispatch(CreditCard creditCard) {

        Optional<String> ovniLibre = this.flota.entrySet().stream().filter(ovnis -> ovnis.getValue() == null).map(Entry::getKey).findFirst();
        
        if (ovniLibre.isPresent()) {

            if(this.getUfoOf(creditCard.number()) == null){

                if(creditCard.pay(500)){
                    this.flota.put(ovniLibre.get(), creditCard.number());
                } 
            
            }


        } else {
            System.out.println("No hay ovnis libres");
        }

    }

    @Override
    public String toString() {

         List<String> setFlota =this.flota.entrySet().stream()
                                                    .map(ovni -> ovni.getKey())
                                                    .collect(Collectors.toList());

        return setFlota.toString();

    }
    
}
