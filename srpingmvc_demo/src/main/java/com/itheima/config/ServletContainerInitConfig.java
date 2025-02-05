package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * servlet容器配置类
 */
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
    @Override  //创建SpringMvc容器  表现层
    protected WebApplicationContext createServletApplicationContext() {

//        ApplicationContext ctx = new AnnotationConfigApplicationContext();
        //加载配置文件，创建SpringMvc容器
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    @Override  //设置哪些请求交给SpringMvc处理
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override  //创建Spring容器 spring配置消费者层 dao层 管理
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
