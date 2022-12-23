package com.intro.exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException{
        if (value <= 0)
            throw new IOException();
    }

    public void withdraw (float value) throws AccountException {
        if (value > balance) {
            throw new AccountException(new AccountException(new InsufficientFundsException()));
        }
    }
}
