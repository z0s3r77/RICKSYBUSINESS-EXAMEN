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
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    protected int stock(){
        return this.stock;
    }


    


}
