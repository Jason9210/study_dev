package com.study.mybatis.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @Author xupengtao
 * @Date 2020/6/28 10:55
 * @Version version 1.0.0
 **/
@Configuration
public class DataSourceConfig {

/*    @Bean
    public DataSource dataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try{
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql_study");
            dataSource.setUser("root");
            dataSource.setPassword("123456");
        }catch (Exception e){

        }
        return dataSource;
    }*/


/*    public SqlSessionFactoryBean sqlSessionFactory(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
<!-- 注入数据库连接池 -->
        <property name="dataSource" ref="dataSource"/>
        <!-- 配置MyBaties全局配置文件:mybatis-config.xml -->
        <property name="configLocation" value="classpath:mybatis-config.xml"/>
        <!-- 扫描pojo包 使用别名 -->
        <property name="typeAliasesPackage" value="com.pojo"/>
        <!-- 扫描sql配置文件:mapper需要的xml文件 -->
        <property name="mapperLocations" value="classpath:mapper/*.xml"/>
————————————————
        版权声明：本文为CSDN博主「x小陌」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
        原文链接：https://blog.csdn.net/u_my_heart/java/article/details/93750542
        return sqlSessionFactoryBean;
    }*/
}
