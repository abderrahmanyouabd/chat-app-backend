package com.a1st.chatAppApi.messaging.domain.message.aggregate;

import com.a1st.chatAppApi.common.error.domain.Assert;
import com.a1st.chatAppApi.messaging.domain.message.valueObject.ConversationName;
import com.a1st.chatAppApi.messaging.domain.message.valueObject.ConversationPublicId;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
@RequiredArgsConstructor
@Builder
@Getter
public class Conversation {
    private final Long db_id;
    private final Set<Message> messages;
    private final Set<User> members;
    private final ConversationPublicId conversationPublicId;
    private final ConversationName conversationName;

    private void assertMandatoryFields(Set<User> users, ConversationName conversationName) {
        Assert.notNull("users", users);
        Assert.notNull("conversationName", conversationName);
    }
}
