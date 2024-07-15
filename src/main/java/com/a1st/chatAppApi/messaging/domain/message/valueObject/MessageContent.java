package com.a1st.chatAppApi.messaging.domain.message.valueObject;

import java.awt.*;
import java.io.Serializable;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public record MessageContent(String text, TrayIcon.MessageType messageType, MessageMediaContent mediaContent) {

}
