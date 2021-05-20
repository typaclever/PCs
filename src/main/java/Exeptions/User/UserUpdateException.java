package Exeptions.User;

public class UserUpdateException extends Exception {
    public UserUpdateException() {
    }

    public UserUpdateException(String message) {
        super(message);
    }
}
