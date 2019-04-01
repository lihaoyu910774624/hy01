package com.li02.hy.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*
 *@Author: lihaoyu
 *@Date:2019/3/8,15:35
 *@Description:
 *@Modified:
 */
@WebListener
public class AyUserListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("上下文开始*******************");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      System.out.println("上下文销毁***********");
    }
}
