package com.blitz.blog.utils.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by yhy on 2016/11/30.
 */
public class ContentPahtListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();
        ctx.setAttribute("home",ctx.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
