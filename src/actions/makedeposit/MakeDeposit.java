package actions.makedeposit;

import datastore.DataStore;

/**
 * Created by kofikyei on 4/30/16.
 */
public abstract class MakeDeposit {

    DataStore dataStore;
    public abstract void makeDeposit();
}