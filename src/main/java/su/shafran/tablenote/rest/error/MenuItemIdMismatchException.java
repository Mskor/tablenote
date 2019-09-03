package su.shafran.tablenote.rest.error;

public class MenuItemIdMismatchException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "Invalid MenuItem id";

    public MenuItemIdMismatchException() {
        super(DEFAULT_MESSAGE, null);
    }
}
