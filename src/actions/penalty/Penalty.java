package actions.penalty;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for assigning Penalty.
 */
public abstract class Penalty {
    DataStore dataStore;
    public abstract void penalty();
}
