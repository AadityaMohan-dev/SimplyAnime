package com.simply_anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.simply_anime.service.MyUserDetailService;


@Configuration
@EnableWebSecurity
public class Security {
	
	@Autowired
	private MyUserDetailService myUserDetailService;
	
	@Bean // Create Object which are managed by spring boot 
	public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
		http.authorizeHttpRequests((authorise) -> {
			try {
				
				authorise.requestMatchers("/api/user/login").permitAll()
				//Customer Api's
				.requestMatchers("/api/customer/add").permitAll()
				
				.anyRequest()
				.permitAll()
				.and()
				.csrf().disable();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		})
		.httpBasic(Customizer.withDefaults());
		http.authenticationProvider(getDBAuth());
		return http.build();
		
	}
	
	@Bean
	public PasswordEncoder getPaswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider getDBAuth() {
		DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
		dao.setPasswordEncoder(getPaswordEncoder());
		dao.setUserDetailsService(myUserDetailService);
		return dao;
	}

}
