package client;

import datastore.DataStore1;
import factory.Account1AbsFactory;
import mdaevents.IEvents;


/**
 * Created by APPIAH-KUBI DESMOND on 5/1/16.
 * Concrete Implementation for Account1
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
        try {
            dataStore.setTemp_pin(pin);
            if(pin.equals(dataStore.getPin())){
                if(Float.parseFloat(dataStore.getBal()) > 500){
                    events.correctPinAboveMin();
                }else events.correctPinBelowMin();
            }else events.incorrectPin(3);
        } catch (NullPointerException e) {
        }
    }

    public void deposit(float amt){
        dataStore.setTemp_deposit_amt(amt);
        events.deposit();
        try {
            if(Float.parseFloat(dataStore.getBal()) > 500){
                events.aboveMinBalance();
            }
            else events.belowMinBalance();
        } catch (NumberFormatException e) {
        }
        catch (NullPointerException e) {
        }
    }

    public void withdraw(float amt){
        dataStore.setTemp_withdrawal_amt(amt);
        events.withdraw();
        try {
            if(Float.parseFloat(dataStore.getBal()) > 500){
                events.aboveMinBalance();
            }
            else events.withdrawBelowMinBalance();
        } catch (NumberFormatException e) {
        }
        catch (NullPointerException e) {
        }
    }

    public void balance(){

        try {
            events.balance();
        } catch (Exception e) {
        }
    }

    public void login(String uid){
        try {
            dataStore.setTemp_id(uid);
            if(uid.equals(dataStore.getId())) events.login();
            else events.incorrectLogin();
        } catch (Exception e) {
            System.out.println("Please enter 0 to open account");
        }
    }

    public void logout()
    {
        try {
            events.logout();
        } catch (Exception e) {
        }
    }

    public void lock(String pin){

        try {
            if(pin.equals(dataStore.getPin())) events.lock();
            else events.incorrectLock();
        } catch (Exception e) {
        }
    }


    public void unlock(String pin){
        try {
            if(pin.equals(dataStore.getPin())){
                events.unlock();
                if(Float.parseFloat(dataStore.getBal()) > 500){
                    events.aboveMinBalance();
                }
                else events.belowMinBalance();
            }else{
                events.incorrectUnlock();
            }
        } catch (Exception e) {
        }
    }
}
