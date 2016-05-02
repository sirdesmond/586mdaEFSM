package actions.incorrectidmsg;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for throwing IncorrectIdMsg warning.
 */
public class IncorrectIdMsg_1 extends IncorrectIdMsg{

    public IncorrectIdMsg_1(DataStore ds) {
        this.dataStore = ds;
    }

    @Override
    public void incorrectIdMsg() {
        System.out.println("Incorrect ID provided: "+ dataStore.getTemp_id());
        System.out.println("Enter 5 to login again");
    }
}
