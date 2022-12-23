package com.intro.exceptions;

//Checked -> extend Exception
//Unchecked (runtime) -> extend RuntimeException

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Insufficent funds in your account.");
    }
    public InsufficientFundsException(String message) {
        super(message);
    }
}
