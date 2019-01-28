package lib;

import org.omg.CORBA.UserException;

public class UserExceptionHandle extends UserException {

    public UserExceptionHandle(String message){
        super(message);
    }
}
