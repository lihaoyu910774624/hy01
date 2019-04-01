/*
package com.li02.hy;

*/
/*
 *@Author: lihaoyu
 *@Date:2019/3/23,16:29
 *@Description:
 *@Modified:
 *//*


import com.li02.hy.activemq.AyMoodProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;

import javax.annotation.Resource;

public class activemqTest {
    @Resource
    private AyMoodProducer ayMoodProducer;

    @Test
    public void testActiveMq(){
        ActiveMQQueue destination = new ActiveMQQueue("ay.queue");
        ayMoodProducer.sendMessage(destination,"hello,mq!");
    }



}
*/
