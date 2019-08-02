package com.mf_rpc_api.openlegacy;

import org.openlegacy.oauth.OLOauthAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring boot application
 */
@SpringBootApplication(exclude = {
        HibernateJpaAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        OLOauthAutoConfiguration.class,
        SecurityAutoConfiguration.class,
        TransactionAutoConfiguration.class})
public class MfRpcApiServletApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MfRpcApiServletApplication.class, args);
    }

   // override configure method   
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	   return builder.sources(MfRpcApiServletApplication.class);
   }

}

