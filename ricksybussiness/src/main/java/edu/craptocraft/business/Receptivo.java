package edu.craptocraft.business;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {
    
    List<GuestDispatcher> dispatchers = new ArrayList<GuestDispatcher>();

    public Receptivo(){}

    public void registra(GuestDispatcher dispatcher){
        this.dispatchers.add(dispatcher);
    }

    public int getDispatchers(){
        return this.dispatchers.size();
    }
}
