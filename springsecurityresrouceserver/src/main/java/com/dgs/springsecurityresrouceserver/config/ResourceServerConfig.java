package com.dgs.springsecurityresrouceserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig {

	// We don't need to extend the extend the ResourceServerConfigurerAdapter because we don't need 
	// to specify a TokenStore at all. And the only thing that we actually need to do is to specify
	// the check_token because you need to establish a comunication between Authorization Server and
	// Resource Server. If we don't do that it'll not work, because now we're splitting it into 2 apps,
	// in the previous app, it was working because we didn't have 2 microservices and being in the same 
	// app the tokens are there and they are seen by both the Authorization Server and the Resource
	// Server because is the same app, is the same context, but now we have 2 different apps, they don't
	// know one of the other anymore if you don't do something for this to happen. And this is why we 
	// need to implement this check_token. So we need to add some information in the application.properties
}
