package com.acai.config;

import com.acai.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月16日 15:23
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {

    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/pages/**").addResourceLocations("classpath:/pages/**");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/**");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/**");
        registry.addResourceHandler("/plugins/**").addResourceLocations("classpath:/plugins/**");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books");
    }
}
