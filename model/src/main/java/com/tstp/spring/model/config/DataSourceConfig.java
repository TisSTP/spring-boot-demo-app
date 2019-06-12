package com.tstp.spring.model.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author sathaphorn.stp (Tis)
 * @since 12-06-2019, 23:48
 */
@Configuration
@EnableTransactionManagement
@EntityScan("com.tstp.spring.model.domain.entity")
@EnableJpaRepositories("com.tstp.spring.model.domain.repository")
public class DataSourceConfig {

}
