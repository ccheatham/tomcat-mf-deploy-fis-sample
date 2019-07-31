package com.mf_rpc_api.openlegacy.config;

import static com.google.common.collect.Lists.newArrayList;
import org.openlegacy.swagger.models.SwaggerDocketConfig;
import org.openlegacy.swagger.utils.OLSwaggerDocketUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.OAuthBuilder;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.ClientCredentialsGrant;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
 
/**
* Swagger configuration
*/
@Configuration
@EnableSwagger2
public class MfRpcApiSwaggerConfiguration {
 
   @Bean
   public Docket swaggerDocket() {
      return OLSwaggerDocketUtils
                .createSwaggerDocket(SwaggerDocketConfig.builder()
                .title("mf-rpc-api")
                .version("0.1")
                .description("mf-rpc-api API").build())
                .securitySchemes(newArrayList(new OAuthBuilder().name("oauth2")
                .grantTypes(newArrayList(new ClientCredentialsGrant("oauth/token")))
                .scopes(newArrayList(
                   new AuthorizationScope("test", "Test")))
                .build()));
   }
 
}