package com.spring.annotation.web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-03-24 8:53
 */
public class WebApplicationConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //创建一个基于注解的web应用的上下文配置对象，实用AnnotationConfigRegistry
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //将WebMvcConfig的配置类注册进来

        //设置servletContext
        ctx.setServletContext(servletContext);
        //刷新
        ctx.refresh();
        //映射规则的配置
        ServletRegistration.Dynamic registration =
                servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        //添加规则
        registration.addMapping("/");
        //设置该servlet的启动优先级
        registration.setLoadOnStartup(1);
    }
}
