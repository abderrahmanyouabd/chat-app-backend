package com.a1st.chatAppApi.messaging.domain.message.valueObject;

import com.a1st.chatAppApi.common.error.domain.Assert;

import java.util.UUID;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public record MessagePublicId(UUID messagePublicId) {

    public MessagePublicId {
        Assert.notNull(String.valueOf(messagePublicId), "message public id cannot be null");
    }
}
