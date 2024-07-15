package com.a1st.chatAppApi.messaging.domain.message.valueObject;

import com.a1st.chatAppApi.common.error.domain.Assert;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }

}
