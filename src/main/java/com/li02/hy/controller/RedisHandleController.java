package com.li02.hy.controller;

import com.li02.hy.redis.RedisTokenHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/openapi/redis/")
public class RedisHandleController {
    private final static Logger logger = LoggerFactory.getLogger(RedisHandleController.class);
    @Resource
    private RedisTokenHelper redisTokenHelper;


    /**
     * 监听所有db的过期事件__keyevent@*__:expired"
     * @author lsm
     */
    @Component
    public class RedisKeyExpirationListener extends KeyExpirationEventMessageListener {

        public RedisKeyExpirationListener(RedisMessageListenerContainer listenerContainer) {
            super(listenerContainer);
        }

        /**
         * 针对redis数据失效事件，进行数据处理
         * @param message
         * @param pattern
         */
        @Override
        public void onMessage(Message message, byte[] pattern) {
            logger.info("》》》》》》》》》》》》进入：onMessage");
            // 用户做自己的业务处理即可,注意message.toString()可以获取失效的key
            String expiredKey = message.toString();
            logger.info("redis回调参数："+expiredKey);


        }
    }





}
