package com.sispar.util;

import com.sispar.exceptions.MyResourceNotFoundException;

public class RestPreconditions {
    public static <T> T checkFound(final T resource) {
        if (resource == null) {
            throw new MyResourceNotFoundException();
        }
        return resource;
    }
}