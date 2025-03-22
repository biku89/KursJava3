package exception;

public class ItemAlredyReturnedException extends RuntimeException {
    public ItemAlredyReturnedException(String message) {
        super(message);
    }
}
