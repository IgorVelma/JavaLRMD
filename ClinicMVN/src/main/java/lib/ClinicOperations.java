package lib;

public enum ClinicOperations {
    ADDCLIENT,
    DELETECLIENT,
    RENAMECLIENT,
    RENAMEPET,
    FIND,
    SHOW,
    EXIT;


    public static ClinicOperations getOperation(char symbol){
        switch (symbol){
            case '1':
                return ADDCLIENT;
            case '2':
                return DELETECLIENT;
            case '3':
                return RENAMECLIENT;
            case '4':
                return RENAMEPET;
            case '5':
                return FIND;
            case '6':
                return SHOW;
            case '7':
                return EXIT;
                default:
                    throw new UnsupportedOperationException(String.valueOf(symbol));
        }
    }
}
