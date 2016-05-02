package actions.incorrectpinmsg;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for throwing IncorrectPinMsg warning.
 */
public class IncorrectPinMsg_1 extends IncorrectPinMsg{

    public IncorrectPinMsg_1(DataStore ds) {
        dataStore = ds;
    }

    @Override
    public void incorrectPinMsg() {
        System.out.println("Incorrect pin provided: "+ dataStore.getTemp_pin());
    }
}
