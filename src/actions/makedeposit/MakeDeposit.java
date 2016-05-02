package actions.makedeposit;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for Making deposit;
 */
public abstract class MakeDeposit {

    DataStore dataStore;
    public abstract void makeDeposit();
}
