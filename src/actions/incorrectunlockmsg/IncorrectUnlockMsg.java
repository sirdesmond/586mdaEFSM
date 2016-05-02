package actions.incorrectunlockmsg;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for throwing IncorrectUnlockMsg warning.
 */
public abstract class IncorrectUnlockMsg {
    DataStore dataStore;
    public abstract void incorrectUnlockMsg();
}
