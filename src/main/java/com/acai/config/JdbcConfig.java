package com.acai.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;

import javax.sql.DataSource;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月07日 14:53
 */
public class JdbcConfig {

    @Value("${driver}")
    private String driver;

    @Value("${url}")
    private String url;

    @Value("${user}")
    private String username;

    @Value("${password}")
    private String password;

    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
}
