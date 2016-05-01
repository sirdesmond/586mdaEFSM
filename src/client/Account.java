package client;

/**
 * Created by kofikyei on 5/1/16.
 */
public abstract class Account {

    public Account() {
        init();
    }

    public abstract void version();
    public abstract void init();
}
