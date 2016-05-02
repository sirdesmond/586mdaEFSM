package actions.incorrectpinmsg;


import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for throwing IncorrectPinMsg warning.
 */
public abstract class IncorrectPinMsg {
    DataStore dataStore;
    public abstract void incorrectPinMsg();
}
