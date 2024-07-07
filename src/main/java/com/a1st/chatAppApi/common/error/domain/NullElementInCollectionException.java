package com.a1st.chatAppApi.common.error.domain;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public class NullElementInCollectionException extends AssertionException {

    public NullElementInCollectionException(String field) {
        super(field, message(field));
    }

    private static String message(String field) {
        return new StringBuilder().append("The field \"").append(field).append("\" contains a null element").toString();
    }

    @Override
    public AssertionErrorType type() {
        return AssertionErrorType.NULL_ELEMENT_IN_COLLECTION;
    }
}
