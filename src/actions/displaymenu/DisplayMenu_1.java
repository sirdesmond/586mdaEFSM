package actions.displaymenu;

/**
 * Created by kofikyei on 4/30/16.
 */
public class DisplayMenu_1 extends DisplayMenu{

    @Override
    public void displayMenu() {
        System.out.println("*************************************************");
        System.out.println("Select operation:");
        System.out.println("\t 0. open (string pin, string id, float amt)");
        System.out.println("\t 1. pin (string x)");
        System.out.println("\t 2. deposit (float d)");
        System.out.println("\t 3. withdraw (float w)");
        System.out.println("\t 4. balance ()");
        System.out.println("\t 5. login(string y)");
        System.out.println("\t 6. logout()");
        System.out.println("\t 7. lock(string x)");
        System.out.println("\t 8. unlock(string x)");
        System.out.println("**************************************************");
    }
}
