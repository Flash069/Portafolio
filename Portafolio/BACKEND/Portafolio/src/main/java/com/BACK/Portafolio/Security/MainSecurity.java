/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BACK.Portafolio.Security;

import com.BACK.Portafolio.Security.JWT.JwtEntryPoint;
import com.BACK.Portafolio.Security.JWT.JwtTokenFilter;
import com.BACK.Portafolio.Security.Service.UserDetailsImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)


public class MainSecurity 
        //extends WebSecurityConfigurerAdapter
{
    
    @Autowired
    UserDetailsImp userDetailsServiceImp;
    @Autowired
    JwtEntryPoint jwtEntryPoint;
    
  
    @Bean
    public JwtTokenFilter jwtTokenFilter(){
        return new JwtTokenFilter();
    }
    
//    @Bean
//    public PasswordEncoder passwordEncoder()
//    {
//        return new BCryptPasswordEncoder(); }
//    
}

//    private static class PasswordEncoder {
//
//        public PasswordEncoder() {
//        }
//    }
    
}
    
//// @Override
////protected void configure(HttpSecurity http) throws Exception{
////super.configure(http); 
////}
// // @Override
//protected AuthenticationManager authenticationManager() throws Exception {
//return super.authenticationManager(); 
//}
//
//@Override
//public AuthenticationManager authenticationManagerBean() throws Exception {
//return super.authenticationManagerBean(); 
//}
//@Override
//protected void configure(AuthenticationManagerBuilder auth) throws Exception ({
//super.configure(auth); 
//}
//    
//}
