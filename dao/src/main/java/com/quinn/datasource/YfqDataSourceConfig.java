package com.quinn.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * @author Quinn
 * @date 2018/1/18
 * @EnableTransactionManagement 支持开启事物
 * @package com.quinn.yfq.datasource
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = YfqDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "yfqSqlSessionFactory")
public class YfqDataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.quinn.yfq.dao";
    static final String MAPPER_LOCATION = "classpath*:mapper/yfq/*.xml";


    @Value("${yfq.datasource.url}")
    private String url;

    @Value("${yfq.datasource.username}")
    private String user;

    @Value("${yfq.datasource.password}")
    private String password;

    @Value("${yfq.datasource.driver}")
    private String driverClass;

    @Bean(name = "yfqDataSource")
    public DataSource yfqDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "yfqTransactionManager")
    public DataSourceTransactionManager yfqTransactionManager() {
        return new DataSourceTransactionManager(yfqDataSource());
    }

    @Bean(name = "yfqSqlSessionFactory")
    public SqlSessionFactory yfqSqlSessionFactory(@Qualifier("yfqDataSource") DataSource masterDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(masterDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(YfqDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }


    /**
     * 有多少个从库就要配置多少个 yfqlication.properties 方式
     * @return
     */
//    @Bean(name = "readDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.read")
//    public DataSource readDataSourceOne() {
//        return DataSourceBuilder.create().type(dataSourceType).build();
//    }

}
