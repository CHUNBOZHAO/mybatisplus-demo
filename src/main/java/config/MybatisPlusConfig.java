package config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

//Spring boot方式
@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    @Bean
//    public PageHelper pageHelper() {
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("offsetAsPageNum", "true");
//        properties.setProperty("rowBoundsWithCount", "true");
//        properties.setProperty("reasonable", "true");
//        //配置mysql数据库的方言
//        properties.setProperty("dialect", "mysql");
//        pageHelper.setProperties(properties);
//        return pageHelper;
//    }
}
