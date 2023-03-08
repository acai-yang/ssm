package com.acai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月07日 14:51
 */
@Configuration //声明为配置类
@ComponentScan("com.acai.service") //配置Spring对象扫描的作用域
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
