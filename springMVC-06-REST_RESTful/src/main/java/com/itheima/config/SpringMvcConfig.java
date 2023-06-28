package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Mendy
 * @create 2023-06-28 17:46
 */

@Configuration
@ComponentScan("com.itheima.controller")
//Enable the automatic conversion to JSON data types
@EnableWebMvc
public class SpringMvcConfig {
}

