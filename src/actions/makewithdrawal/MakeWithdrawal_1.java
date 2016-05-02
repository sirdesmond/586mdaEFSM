package actions.makewithdrawal;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for making account 1 withdrawal.
 */
public class MakeWithdrawal_1 extends MakeWithdrawal{
    public MakeWithdrawal_1(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void makeWithdrawal() {
        dataStore.setBal(String.valueOf(Float.parseFloat(dataStore.getBal()) - dataStore.getTemp_withdrawal_amt()));
        System.out.println("$"+dataStore.getTemp_withdrawal_amt() + " withdrawn");
    }
}
