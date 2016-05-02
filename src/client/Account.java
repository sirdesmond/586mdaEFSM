package client;

/**
 * Created by APPIAH-KUBI DESMOND on 5/1/16.
 * Abstract class for creating accounts
 */
public abstract class Account {

    public Account() {
        init();
    }

    public abstract void version();
    public abstract void init();
}
