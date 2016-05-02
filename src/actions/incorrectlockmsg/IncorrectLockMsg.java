package actions.incorrectlockmsg;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for throwing IncorrectLockMsg warning.
 */
public abstract class IncorrectLockMsg {
    DataStore dataStore;
    public abstract void incorrectLockMsg();
}
