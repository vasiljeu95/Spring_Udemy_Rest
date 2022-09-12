package com.github.vasiljeu95.exeptionHandling;

/**
 * NoSuchEmployeeExeption
 *
 * @author Stepan Vasilyeu
 * @since 12.09.2022
 */
public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
