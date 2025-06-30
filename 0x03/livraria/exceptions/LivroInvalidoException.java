package exceptions;

import java.lang.Exception;

public class LivroInvalidoException extends Exception{

    public LivroInvalidoException(String message){
        super(message);
    }

}