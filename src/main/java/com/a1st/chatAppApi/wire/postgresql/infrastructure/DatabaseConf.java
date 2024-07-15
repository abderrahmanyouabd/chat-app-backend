package com.a1st.chatAppApi.wire.postgresql.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: Abderrahman Youabd aka: A1ST
 * @version: 1.0
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.a1st.chatAppApi"})
@EnableJpaAuditing
public class DatabaseConf {

}
