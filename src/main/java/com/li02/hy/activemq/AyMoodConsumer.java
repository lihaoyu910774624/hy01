/*
package com.li02.hy.activemq;

*/
/*
 *@Author: lihaoyu
 *@Date:2019/3/23,16:06
 *@Description:
 *@Modified:
 *//*


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AyMoodConsumer {

   @JmsListener(destination = "ay.queue")
   public void receiveQueue(String text){

       System.out.println("用户发表说说  【"+text+"】成功");
   }

   @Resource
    private AyMoodService ayMoodService;
   @JmsListener(destination = "ay.queue.asyn.save")
   public void receiveQueue(AyMood ayMood){

       ayMoodService.save(ayMood);
   }
}
*/
