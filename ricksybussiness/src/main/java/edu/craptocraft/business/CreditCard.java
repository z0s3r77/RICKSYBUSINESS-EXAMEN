package edu.craptocraft.business;

public class CreditCard {
    
    private final String owner ;
    private final String number;
    private double credit;

    public CreditCard(String owner, String number){

        this.owner = owner;
        this.number = number;
        this.credit = 3000.0;
    }


    public String number(){
        return this.number;
    }

    protected String cardOwner(){
        return this.owner;
    }

    public double credit(){
        return this.credit;
    }


    protected boolean pay(double cantidadApagar){

        if(cantidadApagar > credit()){
            return false;
        }else{
            this.credit -= cantidadApagar;
            return true;
        }
    }

    @Override
    public String toString() {

        StringBuilder creditCard = new StringBuilder();

        creditCard.append("owner:\t"+cardOwner()+"\n");
        creditCard.append("number:\t"+number()+"\n");
        creditCard.append("credit:\t"+credit()+"EZI");
        
        return creditCard.toString();
        

    }


}
