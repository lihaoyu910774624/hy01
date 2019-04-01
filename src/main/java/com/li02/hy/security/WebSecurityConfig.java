package com.li02.hy.security;

/*
 *@Author: lihaoyu
 *@Date:2019/3/27,14:14
 *@Description:
 *@Modified:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().failureUrl("/login?error").defaultSuccessUrl("/ayUser/test").permitAll();
        super.configure(http);
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("li").password("123456").roles("ADMIN").and().withUser("hao").
                password("123456").roles("USER");
    }

}
