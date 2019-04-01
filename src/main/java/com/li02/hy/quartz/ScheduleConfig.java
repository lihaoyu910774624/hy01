package com.li02.hy.quartz;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/*
 *@Author: lihaoyu
 *@Date:2019/3/8,20:44
 *@Description:
 *@Modified:
 */
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        //通过ScheduleConfig配置文件实现SchedulingConfigurer接口，并重写setSchedulerfang方法  实现多线程
        //taskRegistrar.setScheduler(Executors.newScheduledThreadPool(5));
    }
}
