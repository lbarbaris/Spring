package com.lbarbaris.spring.conf;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.lbarbaris.spring")
@EnableWebMvc
@EnableTransactionManagement
public class myConfig {

        @Bean
        public DataSource dataSource(){
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            try {
                dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
                dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/spring5?useSSL=false&amp&serverTimezone=UTC");
                dataSource.setUser("root");
                dataSource.setPassword("Rambuser1");
            }
            catch (PropertyVetoException e){
                e.printStackTrace();
            }
            return dataSource;
        }

        @Bean
        public LocalSessionFactoryBean sessionFactoryBean() {
            LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
            sessionFactoryBean.setDataSource(dataSource());
            sessionFactoryBean.setPackagesToScan("com.lbarbaris.spring.entity");

            Properties hibernateProperties = new Properties();
            hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            hibernateProperties.setProperty("hibernate.show_sql", "true");
            sessionFactoryBean.setHibernateProperties(hibernateProperties);
            return sessionFactoryBean;
        }

        @Bean
        public HibernateTransactionManager hibernateTransactionManager(){
            HibernateTransactionManager transactionManager = new HibernateTransactionManager();

            transactionManager.setSessionFactory(sessionFactoryBean().getObject());


            return transactionManager;
        }

}
