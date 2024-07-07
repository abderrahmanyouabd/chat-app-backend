package com.a1st.chatAppApi.common.error.domain;
import java.util.Map;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */


public abstract class AssertionException extends RuntimeException {

    private final String field;

    protected AssertionException(String field, String message) {
        super(message);
        this.field = field;
    }

    public abstract AssertionErrorType type();

    public String field() {
        return field;
    }

    public Map<String, String> parameters() {
        return Map.of();
    }
}