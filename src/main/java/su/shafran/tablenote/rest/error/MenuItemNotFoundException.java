package su.shafran.tablenote.rest.error;

public class MenuItemNotFoundException extends RuntimeException {

    public static final String DEFAULT_MESSAGE="Didn't find the requested book";

    public MenuItemNotFoundException() {
        super(DEFAULT_MESSAGE, null);
    }

    public MenuItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
