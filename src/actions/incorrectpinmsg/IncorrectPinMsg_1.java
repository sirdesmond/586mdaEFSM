package actions.incorrectpinmsg;

import datastore.DataStore;

/**
 * Created by kofikyei on 4/30/16.
 */
public class IncorrectPinMsg_1 extends IncorrectPinMsg{

    public IncorrectPinMsg_1(DataStore ds) {
        dataStore = ds;
    }

    @Override
    public void incorrectPinMsg() {
        System.out.println("Incorrect pin provided: "+ dataStore.getPin());
    }
}
