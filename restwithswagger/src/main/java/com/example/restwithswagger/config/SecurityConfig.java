package com.example.restwithswagger.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        auth.inMemoryAuthentication().withUser("india").password("{noop}india").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        // Comment : In-memory authentication.
/*        http.authorizeRequests().antMatchers("/player").authenticated()
                .and().formLogin()
                .and().logout().logoutSuccessUrl("/player/**")
                .deleteCookies("JSESSIONID").invalidateHttpSession(true);*/

        //Comment - Non-Form based authentication. Going in via HTTP Request.
        http.authorizeRequests().antMatchers("/player/**").authenticated()
                .and().httpBasic().and().csrf().disable();
    }

}
