package com.quinn.payment.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * @author Quinn
 * @date 2018/1/18
 * @EnableTransactionManagement 支持开启事物
 * @package com.quinn.payment.datasource
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = DataSourceConfig.PACKAGE, sqlSessionFactoryRef = "paymentSqlSessionFactory")
public class DataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.quinn.payment.dao";
    static final String MAPPER_LOCATION = "classpath*:mapper/entity/*.xml";


    @Value("${payment.datasource.url}")
    private String url;

    @Value("${payment.datasource.username}")
    private String user;

    @Value("${payment.datasource.password}")
    private String password;

    @Value("${payment.datasource.driver}")
    private String driverClass;

    @Bean(name = "paymentDataSource")
    @Primary
    public DataSource paymentDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "paymentTransactionManager")
    @Primary
    public DataSourceTransactionManager masterTransactionManager() {
        return new DataSourceTransactionManager(paymentDataSource());
    }

    @Bean(name = "paymentSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("paymentDataSource") DataSource masterDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(masterDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(DataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }


    /**
     * 有多少个从库就要配置多少个 paymentlication.properties 方式
     * @return
     */
//    @Bean(name = "readDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.read")
//    public DataSource readDataSourceOne() {
//        return DataSourceBuilder.create().type(dataSourceType).build();
//    }

}
