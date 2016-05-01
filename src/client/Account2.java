package client;

import datastore.DataStore2;
import factory.Account2AbsFactory;
import mdaevents.IEvents;

/**
 * Created by kofikyei on 5/1/16.
 */
public class Account2 extends Account{

    Account2AbsFactory factory;
    IEvents events;
    DataStore2 dataStore;

    @Override
    public void version() {
        System.out.println("Account2");
    }

    @Override
    public void init() {
        factory = new Account2AbsFactory();
        events = factory.getEvents();
        dataStore = (DataStore2) factory.getDataStore();
    }

    public Account2AbsFactory getFactory() {
        return factory;
    }

    public void OPEN (int pin, int uid, int bal){
        dataStore.setTemp_pin(pin);
        dataStore.setTemp_id(uid);
        dataStore.setTemp_bal(bal);
        events.open();
    }

    public void PIN(int pin){
        if(pin == Integer.parseInt(dataStore.getPin())){
                events.correctPinAboveMin();
        }else events.incorrectPin(2);
    }

    public void DEPOSIT(int amt){
        dataStore.setTemp_deposit_amt(amt);
        events.deposit();
    }

    public void WITHDRAW(int amt){
        dataStore.setTemp_withdrawal_amt(amt);
        if(Float.parseFloat(dataStore.getBal()) > 0){
            events.withdraw();
        }
        else events.noFunds();
    }

    public void BALANCE(){
        events.balance();
    }

    public void LOGIN(int uid){
        if(uid == Integer.parseInt(dataStore.getId())) events.login();
        else events.incorrectLogin();
    }

    public void LOGOUT(){
        events.logout();
    }

    public void suspend(){events.suspend();}

    public void activate(){events.activate();}

    public void close(){events.close();}
}
