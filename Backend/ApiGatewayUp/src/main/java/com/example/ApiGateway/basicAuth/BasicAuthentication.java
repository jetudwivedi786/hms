//package com.example.ApiGateway.basicAuth;
//
//import com.example.ApiGateway.basicAuth.service.MyUserDetailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//
//public class BasicAuthentication extends WebSecurityConfigurerAdapter {
//	@Autowired
//	private MyUserDetailService userservice;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
////		http.authorizeRequests().antMatchers("/index").permitAll().anyRequest().authenticated().and().httpBasic();//for antmatcher access or block the required page
//		http.csrf().disable().authorizeRequests().antMatchers("/manageStaff/**").permitAll()
////				.antMatchers("/about","/index").hasRole("ADMIN")
//				.anyRequest().authenticated().and().httpBasic();// give access to particular role(role
//																					// bassed)
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().withUser("jeetu").password(this.passwordEncoder().encode("111")).roles("NORMAL");
////		// auth.inMemoryAuthentication().withUser("jeetu").password("234").roles("ADMIN");
////		auth.inMemoryAuthentication().withUser("admin").password(this.passwordEncoder().encode("222")).roles("ADMIN");
//		auth.userDetailsService(userservice).passwordEncoder(passwordEncoder());
//
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		// return NoOpPasswordEncoder.getInstance();
//		return new BCryptPasswordEncoder(10);
//
//	}
//
//}
