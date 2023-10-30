package homeworks.onlineshop.command;

public interface Command {

    // main menu command
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";

    // admin command
    String LOGOUT = "0";
    String ADD_PRODUCT = "1";
    String REMOVE_PRODUCT_BY_ID = "2";
    String PRINT_PRODUCTS = "3";
    String PRINT_USERS = "4";
    String PRINT_ORDERS = "5";
    String CHANGE_ORDERS_STATUS = "6";

    // user command
    String PRINT_ALL_PRODUCTS = "1";
    String BUY_PRODUCT = "2";
    String PRINT_MY_ORDERS = "3";
    String CANCEL_ORDER_BY_ID = "4";


    static void printCommands() {
        System.out.println("=========== -*- Main menu -*- ============");
        System.out.println("Please enter " + EXIT + " for exit");
        System.out.println("Please enter " + LOGIN + " for login");
        System.out.println("Please enter " + REGISTER + " for register");
        System.out.println("==========================================");
    }

    static void printAdminLoginCommands() {
        System.out.println("Please enter " + LOGOUT + " for logout.");
        System.out.println("Please enter " + ADD_PRODUCT + " for add product.");
        System.out.println("Please enter " + REMOVE_PRODUCT_BY_ID + " for remove product by id.");
        System.out.println("Please enter " + PRINT_PRODUCTS + " for print products.");
        System.out.println("Please enter " + PRINT_USERS + " for print users.");
        System.out.println("Please enter " + PRINT_ORDERS + " for print orders.");
        System.out.println("Please enter " + CHANGE_ORDERS_STATUS + " change orders status.");
    }

    static void printUserLoginCommands() {
        System.out.println("Please enter " + LOGOUT + " for logout.");
        System.out.println("Please enter " + PRINT_ALL_PRODUCTS + " for print all products.");
        System.out.println("Please enter " + BUY_PRODUCT + " for buy product.");
        System.out.println("Please enter " + PRINT_MY_ORDERS + " for print my orders.");
        System.out.println("Please enter " + CANCEL_ORDER_BY_ID + " for cancel order by id.");
    }
}