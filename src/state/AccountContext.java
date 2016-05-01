package state;

import datastore.DataStore;
import factory.AccountAbstractFactory;


/**
 * Created by kofikyei on 4/30/16.
 */
public class AccountContext {
    State ready;
    State idle;
    State locked;
    State overdrawn;
    State suspended;
    State checkPin;

    private State currentState;

    DataStore dataStore;
    AccountAbstractFactory factory;

    public AccountContext(DataStore ds, AccountAbstractFactory factory) {
        ready = new Ready(this,factory);
        idle = new Idle(this,factory);
        locked = new Locked(this,factory);
        overdrawn = new Overdrawn(this,factory);
        suspended = new Suspended(this,factory);
        checkPin = new CheckPin(this,factory);
        currentState = idle;
        this.dataStore = ds;
        this.factory = factory;
    }

    public AccountAbstractFactory getFactory() {
        return factory;
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getReady() {return ready;}

    public State getIdle() {return idle;}

    public State getLocked() {return locked;}

    public State getOverdrawn() {return overdrawn;}

    public State getSuspended() {return suspended;}

    public State getCheckPin() {return checkPin;}

    public void open() {currentState.open();}

    public void login() {currentState.login();}

    public void incorrectLogin() {currentState.incorrectLogin();}

    public void incorectPin(int max) {currentState.incorrectPin(max);}

    public void correctPinBelowMin() {currentState.correctPinBelowMin();}

    public void correctPinAboveMin() {currentState.correctPinAboveMin();}

    public void deposit() {currentState.deposit();}

    public void belowMinBalance() {currentState.belowMinBalance();}

    public void aboveMinBalance() {currentState.aboveMinBalance();}

    public void logout() {currentState.logout();}

    public void balance() {currentState.balance();}

    public void withdraw() {currentState.withdraw();}

    public void withdrawBelowMinBalance() {currentState.withdrawBelowMinBalance();}

    public void noFunds() {currentState.noFunds();}

    public void lock() {currentState.lock();}

    public void incorrectLock() {currentState.incorrectLock();}

    public void unlock() {currentState.unlock();}

    public void incorrectUnlock() {currentState.incorrectUnlock();}

    public void suspend() {currentState.suspend();}

    public void activate() {currentState.activate();}

    public void close() {currentState.close();}
}
