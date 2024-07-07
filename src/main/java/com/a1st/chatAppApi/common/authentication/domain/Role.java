package com.a1st.chatAppApi.common.authentication.domain;

import com.a1st.chatAppApi.common.error.domain.Assert;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */
public enum Role {
    ADMIN,
    USER,
    ANONYMOUS,
    UNKNOWN;

    private static final String PREFIX = "ROLE_";
    private static final Map<String, Role> ROLES = buildRoles();

    private static Map<String, Role> buildRoles() {
        return Stream.of(values()).collect(Collectors.toUnmodifiableMap(Role::key, Function.identity()));
    }

    public String key() {
        return PREFIX + name();
    }

    public static Role from(String role) {
        Assert.notBlank("role", role);

        return ROLES.getOrDefault(role, UNKNOWN);
    }
}
