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
    }};
}
