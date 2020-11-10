package cyker.app.webservices.exceptions;

public class UserServiceException extends RuntimeException{

    private static final long serialVersionUID = -701319091954075216L;

    public UserServiceException(String message) {
        super(message);
    }
}
