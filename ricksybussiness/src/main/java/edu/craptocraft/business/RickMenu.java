package edu.craptocraft.business;

import java.util.ArrayList;
import java.util.List;

public class RickMenu implements GuestDispatcher {


    private int stock;
    private double itemCost;
    private List<String> genteQueHaPagado = new ArrayList<>();

    public RickMenu(int stock, double itemCost){
        this.stock = stock;
        this.itemCost = itemCost;
    }


    public int stock(){
        return this.stock;
    }

    public double itemCost(){
        return this.itemCost;
    }

    @Override
    public void dispatch(CreditCard creditCard) {

        if (stock() > 0 && creditCard.pay(itemCost())) {
            this.stock -= 1;
            this.genteQueHaPagado.add(creditCard.cardOwner());
        }
        
    }
    
    @Override
    public String toString() {
        return this.genteQueHaPagado.toString();
    }
    
}
