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


    protected String number(){
        return this.number;
    }

    protected String cardOwner(){
        return this.owner;
    }

    protected double credit(){
        return this.credit;
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
