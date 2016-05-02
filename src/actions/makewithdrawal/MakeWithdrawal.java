package actions.makewithdrawal;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for making account 1 withdrawal.
 */
public abstract class MakeWithdrawal {
    DataStore dataStore;
    public abstract void makeWithdrawal();
}
