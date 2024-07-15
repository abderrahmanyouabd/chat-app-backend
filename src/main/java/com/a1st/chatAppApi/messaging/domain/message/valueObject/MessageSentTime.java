package com.a1st.chatAppApi.messaging.domain.message.valueObject;

import com.a1st.chatAppApi.common.error.domain.Assert;

import java.time.Instant;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public record MessageSentTime(Instant date) {
    public MessageSentTime{
        Assert.field("date", date).notNull();
    }
}
