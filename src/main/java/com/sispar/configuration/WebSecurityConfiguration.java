package com.sispar.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfiguration 
			extends WebSecurityConfigurerAdapter{
	 
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth)
	      throws Exception {
	  
	        auth.inMemoryAuthentication()
	          .withUser("admin").password("admin").roles("ADMIN")
	          .and()
	          .withUser("user").password("user").roles("USER");
	    }
	 
	    @Override
	    protected void configure(HttpSecurity http) throws Exception { 
	        
	    	/*http.csrf().disable()
	    	.authorizeRequests()
	    	.anyRequest().authenticated().and().formLogin().and().httpBasic()
	    	*/
	    	
	    	/*http.csrf().disable()
	    	.authorizeRequests()
	    	.anyRequest().authenticated().and().httpBasic()
	    	
	    	;*/
	    	http.csrf().disable();	
	    }
	 

	   
}
