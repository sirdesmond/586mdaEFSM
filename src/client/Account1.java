package client;

import datastore.DataStore1;
import factory.Account1AbsFactory;
import mdaevents.IEvents;


/**
 * Created by kofikyei on 5/1/16.
 */
public class Account1 extends Account{

    Account1AbsFactory factory;
    IEvents events;
    DataStore1 dataStore;

    @Override
    public void version() {
        System.out.println("Account1");
    }

    @Override
    public void init() {
        factory = new Account1AbsFactory();
        events = factory.getEvents();
        dataStore = (DataStore1) factory.getDataStore();
    }

    public Account1AbsFactory getFactory() {
        return factory;
    }

    public void open (String pin, String uid, String bal){
        dataStore.setTemp_pin(pin);
        dataStore.setTemp_id(uid);
        dataStore.setTemp_bal(bal);
        events.open();
    }

    public void pin(String pin){
        if(pin.equals(dataStore.getPin())){
            if(Integer.parseInt(dataStore.getBal()) > 500){
                events.correctPinAboveMin();
            }else events.correctPinBelowMin();
        }else events.incorrectPin(3);
    }

    public void deposit(float amt){
        dataStore.setTemp_deposit_amt(amt);
        events.deposit();
        if(Float.parseFloat(dataStore.getBal()) > 500){
            events.aboveMinBalance();
        }
        else events.belowMinBalance();
    }

    public void withdraw(float amt){
        dataStore.setTemp_withdrawal_amt(amt);
        events.withdraw();
        if(Float.parseFloat(dataStore.getBal()) > 500){
            events.aboveMinBalance();
        }
        else events.withdrawBelowMinBalance();
    }

    public void balance(){
        events.balance();
    }

    public void login(String uid){
        System.out.println("uid: "+dataStore.getId());
        if(uid.equals(dataStore.getId())) events.login();
        else events.incorrectLogin();
    }

    public void logout(){
        events.logout();
    }

    public void lock(String pin){
        if(pin.equals(dataStore.getPin())) events.lock();
        else events.incorrectLock();
    }

    public void unlock(String pin){
        if(pin.equals(dataStore.getPin())){
            events.unlock();
            if(Integer.parseInt(dataStore.getBal()) > 500){
                events.aboveMinBalance();
            }
            else events.belowMinBalance();
        }else{
            events.incorrectUnlock();
        }
    }
}
