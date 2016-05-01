package actions.displaybalance;

import datastore.DataStore;

/**
 * Created by kofikyei on 4/30/16.
 */
public class DisplayBalance_1 extends DisplayBalance{

    public DisplayBalance_1(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Balance: $"+ dataStore.getBal());
    }
}
