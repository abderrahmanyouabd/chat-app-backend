package com.a1st.chatAppApi.messaging.domain.message.aggregate;

import com.a1st.chatAppApi.common.error.domain.Assert;
import com.a1st.chatAppApi.messaging.domain.message.valueObject.*;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
@Builder
@RequiredArgsConstructor
public class Message {
    private final MessageSentTime sentTime;
    private final MessageContent content;
    private final MessageSendStatus sendStatus;
    private final MessagePublicId publicId;
    private final UserPublicId sender;
    private final ConversationPublicId conversationId;



    private void assertMandatoryFields(MessageSentTime sentTime, MessageContent content, MessageSendStatus sendStatus, MessagePublicId publicId, UserPublicId sender, ConversationPublicId conversationId) {
        Assert.notNull("sentTime", sentTime);
        Assert.notNull("content", content);
        Assert.notNull("sendStatus", sendStatus);
        Assert.notNull("publicId", publicId);
        Assert.notNull("sender", sender);
        Assert.notNull("conversationId", conversationId);
    }
}
