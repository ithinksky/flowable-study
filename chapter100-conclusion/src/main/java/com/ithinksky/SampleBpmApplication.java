package com.ithinksky;


import com.ithinksky.flowable.ui.modeler.conf.ApplicationConfiguration;
import com.ithinksky.flowable.ui.modeler.servlet.AppDispatcherServletConfiguration;
import org.flowable.rest.service.api.RestResponseFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 功能描述：主程序
 *
 * @author tengpeng.gao
 * @since 2019/4/11
 */
@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class,
        RestResponseFactory.class
})
@SpringBootApplication
@EnableTransactionManagement
public class SampleBpmApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SampleBpmApplication.class, args);
    }

}
