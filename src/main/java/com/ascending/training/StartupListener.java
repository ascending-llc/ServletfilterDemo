package com.ascending.training;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Application context start event");
    }
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Application context destroy event");
    }
}
