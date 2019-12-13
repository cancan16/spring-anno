package com.enjoy.cap11.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/*
 *
 * InfrastructureAdvisorAutoProxyCreator
 * 1,ע��  2�����ú��ô����������ڴ����Ժ󣬰�װ���󣬷���һ�����������ǿ�����������ִ�з���ʱ�����������������е���
 *
 *  AnnotationTransactionAttributeSource��������ǿ��Ҫ������ע�����Ϣ��ʹ��������������ע��
 *  TransactionInterceptor������������������Ϣ�����������  MethodInterceptor
 *  ��ִ��Ŀ�귽��ʱ��
 *     ִ����������
 *     ������������
 *     1.�Ȼ�ȡ�����������
 *     2.��ȡPlatformTransactionManager�����������ֱ�ӵ������л�ȡplatformTransactionManager beanʵ��
 *  ִ��Ŀ�귽����
 *
 *     ����쳣��completeTransactionAfterThrowing�������������ع�����
 *     ������������� ������������ύ����
 *  �����������
 *
 */


@Configuration
@ComponentScan("com.enjoy.cap11")
@EnableTransactionManagement  //������������ܣ���@Transactional������  EnableXXXX
public class Cap11MainConfig {
    //��������Դ
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        //���c3p0��װ��JDBC, dataSource�ӿڵ�ʵ��
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        return dataSource;
    }

    //jdbcTemplate�ܼ���ɾ�Ĳ�Ĳ���
    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        return new JdbcTemplate(dataSource());
    }

    //ע�����������
    @Bean
    public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }
}
