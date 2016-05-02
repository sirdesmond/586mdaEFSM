package actions.incorrectidmsg;


import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for throwing IncorrectIdMsg warning.
 */
public abstract class IncorrectIdMsg {
    DataStore dataStore;
    public abstract void incorrectIdMsg();
}
