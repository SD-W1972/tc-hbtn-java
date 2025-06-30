package exceptions;

import java.lang.Exception;

public class OperacaoInvalidaException extends Exception{
    public OperacaoInvalidaException(String msg){
        super(msg);
    }
}