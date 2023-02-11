package edu.craptocraft.business;

public class CrystalExpender implements GuestDispatcher {


    private int stock;
    private double itemCost;


    public CrystalExpender(int stock , double itemCost){

        this.stock = stock;
        this.itemCost = itemCost;
    }

    

    @Override
    public void dispatch(CreditCard creditCard) {

        if (stock() > 0 && creditCard.pay(itemCost())) {
            this.stock -= 1;
        }
        
    }

    @Override
    public String toString() {
        StringBuilder crystalExpender = new StringBuilder();
        crystalExpender.append("stock:\t"+this.stock()+"\ncost:\t"+this.itemCost());
        return crystalExpender.toString();

    }

    public int stock(){
        return this.stock;
    }

    protected double itemCost(){
        return this.itemCost;
    }

    


}
