package actions.makewithdrawal;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for making account 2 withdrawal.
 */
public class MakeWithdrawal_2 extends MakeWithdrawal{
    public MakeWithdrawal_2(DataStore dataStore) {

        this.dataStore = dataStore;
    }

    @Override
    public void makeWithdrawal() {
        dataStore.setBal(String.valueOf(Float.parseFloat(dataStore.getBal()) - dataStore.getTemp_withdrawal_amt()));
        System.out.println("$"+dataStore.getTemp_withdrawal_amt() + " withdrawn");
    }
}
