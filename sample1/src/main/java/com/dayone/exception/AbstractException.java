package com.dayone.exception;

public abstract class AbstractException extends RuntimeException{

    abstract public int getStatucCode();
    abstract public String getMessage();
}
