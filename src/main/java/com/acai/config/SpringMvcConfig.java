package com.acai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月07日 15:40
 */
@Configuration
@ComponentScan({"com.acai.controller", "com.acai.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
