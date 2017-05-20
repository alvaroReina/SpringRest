package com.formal.bookmarks;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Alvaro on 20/05/2017.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String desc){
        super("could not find user '" + desc + "'.");
    }
}
