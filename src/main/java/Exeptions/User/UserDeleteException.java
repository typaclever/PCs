package Exeptions.User;

public class UserDeleteException extends Exception {
    public UserDeleteException() {
    }

    public UserDeleteException(String message) {
        super(message);
    }
}
