package client;

import datastore.DataStore2;
import factory.Account2AbsFactory;
import mdaevents.IEvents;

/**
 * Created by APPIAH-KUBI DESMOND on 5/1/16.
 * Concrete Implementation for Account2
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
        try {
            dataStore.setTemp_pin(pin);
            if(pin == Integer.parseInt(dataStore.getPin())){
                    events.correctPinAboveMin();
            }else events.incorrectPin(2);
        } catch (Exception e) {
        }
    }

    public void DEPOSIT(int amt){
        dataStore.setTemp_deposit_amt(amt);
        events.deposit();
    }

    public void WITHDRAW(int amt){
        dataStore.setTemp_withdrawal_amt(amt);
        try {
            if(Float.parseFloat(dataStore.getBal()) > 0){
                events.withdraw();
            }
            else events.noFunds();
        } catch (Exception e) {
        }
    }

    public void BALANCE(){

        try {
            events.balance();
        } catch (Exception e) {
        }
    }

    public void LOGIN(int uid){
        try {
            dataStore.setTemp_id(uid);
            if(uid == Integer.parseInt(dataStore.getId())) events.login();
            else events.incorrectLogin();
        } catch (Exception e) {
            System.out.println("Please enter 0 to open account");
        }
    }

    public void LOGOUT(){
        try {
            events.logout();
        } catch (Exception e) {
        }
    }

    public void suspend(){
        try {
            events.suspend();
        } catch (Exception e) {
        }
    }

    public void activate(){
        try {
            events.activate();
        } catch (Exception e) {
        }
    }

    public void close(){
        try {
            events.close();
        } catch (Exception e) {
        }
    }
}
