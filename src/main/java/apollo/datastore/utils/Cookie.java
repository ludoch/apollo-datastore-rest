package apollo.datastore.utils;

public enum Cookie {
    LANG("lang"),
    SESSION_ID("session-id"),
    REMEMBER_ME("remember-me"),
    USER_ID("user-id");

    public static final int MAX_AGE = 60*60*24*365; // 365 days
    public static final String LANG_PATH = "/";
    public static final String UTILS_PATH = "/utils/";
    public static final String SESSION_ID_PATH = "/";

    private final String name;

    Cookie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
