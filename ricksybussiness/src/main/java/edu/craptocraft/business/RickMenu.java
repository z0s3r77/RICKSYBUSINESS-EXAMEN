package edu.craptocraft.business;

public class RickMenu implements GuestDispatcher {


    private int stock;
    private double itemCost;

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
        }
        
    }
    
    
}
