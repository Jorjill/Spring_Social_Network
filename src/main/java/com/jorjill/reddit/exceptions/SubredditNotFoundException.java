package com.jorjill.reddit.exceptions;

public class SubredditNotFoundException extends RuntimeException {
    public SubredditNotFoundException(String message){
        super(message);
    }
}
