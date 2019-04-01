/*
package com.li02.hy;

import com.li02.hy.activemq.AyMoodProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HyApplicationTests {


    @Resource
    private AyMoodProducer ayMoodProducer;
    @Resource
    private AyMoodService ayMoodService ;





    @Test
    public void testActiveMq(){
        ActiveMQQueue destination = new ActiveMQQueue("ay.queue");
        ayMoodProducer.sendMessage(destination,"hello,mq!");
    }
    @Test
    public  void  testAsynSave(){

        AyMood ayMood = new AyMood();
        String uuid =  UUID.randomUUID().toString().replace("-", "");
        ayMood.setId(uuid);
        ayMood.setUserId("2");
        ayMood.setPraiseNum(0);
        ayMood.setContent("这是一条测试数据");
        ayMood.setPublishTime(new Date());
        ayMoodService.asynSave(ayMood);

    }




}
*/
