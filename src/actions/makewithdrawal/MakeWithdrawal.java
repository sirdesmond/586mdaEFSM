package actions.makewithdrawal;

import datastore.DataStore;

/**
 * Created by kofikyei on 4/30/16.
 */
public abstract class MakeWithdrawal {
    DataStore dataStore;
    public abstract void makeWithdrawal();
}
