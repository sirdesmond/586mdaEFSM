package actions.displaybalance;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for displaying balance
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
