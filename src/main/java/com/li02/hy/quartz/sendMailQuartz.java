package com.li02.hy.quartz;

/*
 *@Author: lihaoyu
 *@Date:2019/3/8,20:22
 *@Description:
 *@Modified:
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableScheduling
  public class sendMailQuartz {

 /* @Resource
  private SendJunkMailService sendJunkMailService ;
  @Resource
  private AyUserMapper ayUserMapper ;*/

    /** logger */
    private final static Logger logger = LoggerFactory.getLogger(sendMailQuartz.class);

 /* 通过看 @Scheduled源码可以看出它支持多种参数：
              （1）cron：cron表达式，指定任务在特定时间执行；
              （2）fixedDelay：表示上一次任务执行完成后多久再次执行，参数类型为long，单位ms；
              （3）fixedDelayString：与fixedDelay含义一样，只是参数类型变为String；
              （4）fixedRate：表示按一定的频率执行任务，参数类型为long，单位ms；
              （5）fixedRateString: 与fixedRate的含义一样，只是将参数类型变为String；
              （6）initialDelay：表示延迟多久再第一次执行任务，参数类型为long，单位ms；
              （7）initialDelayString：与initialDelay的含义一样，只是将参数类型变为String；
              （8）zone：时区，默认为当前时区，一般没有用到。*/

    @Scheduled(cron="* */5 * * * *")
    public void reportCurrentByCron(){
      logger.info("定时器开始运行了");
     // List<AyUser>  ayUserList = ayUserMapper.findAll();
     // sendJunkMailService.sendJunkMail(ayUserList);

    }





}
