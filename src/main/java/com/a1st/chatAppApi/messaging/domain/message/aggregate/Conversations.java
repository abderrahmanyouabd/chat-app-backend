package com.a1st.chatAppApi.messaging.domain.message.aggregate;

import com.a1st.chatAppApi.common.error.domain.Assert;

import java.util.List;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public record Conversations(List<Conversation> conversations) {

    public Conversations  {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }
}
