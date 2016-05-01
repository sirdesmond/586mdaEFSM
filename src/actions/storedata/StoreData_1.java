package actions.storedata;

import datastore.DataStore;

/**
 * Created by kofikyei on 4/30/16.
 */
public class StoreData_1 extends StoreData{
    public StoreData_1(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void storeData() {
        dataStore.setBal(dataStore.getTemp_bal());
        dataStore.setId(dataStore.getTemp_id());
        dataStore.setPin(dataStore.getTemp_pin());
        dataStore.setDeposit_amt(dataStore.getTemp_deposit_amt());
        dataStore.setWithdrawal_amt(dataStore.getTemp_withdrawal_amt());
    }
}
