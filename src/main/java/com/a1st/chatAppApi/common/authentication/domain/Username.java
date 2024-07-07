package com.a1st.chatAppApi.common.authentication.domain;

import com.a1st.chatAppApi.common.error.domain.Assert;
import io.micrometer.common.util.StringUtils;

import java.util.Optional;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public record Username(String username) {
    public Username {
        Assert.field("username", username).notBlank().maxLength(100);
    }

    public String get() {
        return username();
    }

    public static Optional<Username> of(String username) {
        return Optional.ofNullable(username).filter(StringUtils::isNotBlank).map(Username::new);
    }
}
