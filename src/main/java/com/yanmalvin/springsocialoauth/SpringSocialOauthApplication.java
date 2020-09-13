package com.yanmalvin.springsocialoauth;

import com.yanmalvin.springsocialoauth.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringSocialOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSocialOauthApplication.class, args);
	}

}
