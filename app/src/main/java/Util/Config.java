package Util;

import java.util.HashMap;
import java.util.Map;

public class Config {

    public final static Map<Integer, String> RETURN_CODES = new HashMap<Integer, String>(){{
        put(0,"OK");
        put(1,"Missing required parameter(s)");
        put(2,"Email already registered");
        put(3,"Login failed check your credentials");
        put(4,"Invalid token");
        put(5,"Internal server error");
        put(6,"Unauthorized action");
        put(7,"Nothing to update");
        put(8,"Transfert error");
    }};

    public final static String BASE_URL = "http://appspaces.fr/esgi/shopping_list/";
    public final static String CREATE_USER_URL = "account/subscribe.php";
    public final static String LOGIN_USER_URL = "account/login.php";
    public final static String CREATE_SHOPPING_LIST_URL = "shopping_list/create.php";
    public final static String LIST_SHOPPING_LIST_URL = "shopping_list/list.php";
    public final static String EDIT_SHOPPING_LIST_URL = "shopping_list/edit.php";
    public final static String REMOVE_SHOPPING_LIST_URL = "shopping_list/remove.php";
    public final static String CREATE_PRODUCT_URL = "product/create.php";
    public final static String LIST_PRODUCT_URL = "product/list.php";
    public final static String EDIT_PRODUCT_URL = "product/edit.php";
    public final static String REMOVE_PRODUCT_URL = "product/remove.php";
}
