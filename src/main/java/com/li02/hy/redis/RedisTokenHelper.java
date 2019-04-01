package com.li02.hy.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 封装Redis存取订单的工具类
 * @author 
 *
 */
@Repository
public class RedisTokenHelper {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Resource(name="stringRedisTemplate")
    ValueOperations<String, String> ops;

    @Resource(name="redisTemplate")
    ValueOperations<Object, Object> objOps;
    /**
     * 键值对存储 字符串 ：有效时间3分钟
     * @param tokenType Token的key
     * @param Token Token的值
     */
    public void save(String tokenType,String Token){
        ops.set(tokenType, Token, 180, TimeUnit.SECONDS);
    }
    /**
     * 根据key从redis获取value
     * @param tokenType
     * @return String
     */
    public String getToken(String tokenType){
        return ops.get(tokenType);
    }
    /**
     * redis 存储一个对象
     * @param key
     * @param obj
     * @param timeout 过期时间  单位：s
     */
    public void saveObject(String key,Object obj,long timeout){
        objOps.set(key, obj,timeout,TimeUnit.SECONDS);
    }
    /**
     * redis 存储一个对象  ,不过期
     * @param key
     * @param obj
     */
    public void saveObject(String key,Object obj){
        objOps.set(key, obj);
    }
    /**
     * 从redis取出一个对象
     * @param key
     * @param obj
     */
    public Object getObject(String key){
        return objOps.get(key);
    }
    /**
     * 根据Key删除Object
     * @param key
     */
    public void removeObject(String key){
        redisTemplate.delete(key);
    }

    /**
     * redisTemplate 序列化使用的jdkSerializeable, 存储二进制字节码, 所以自定义序列化类
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        // 使用Jackson2JsonRedisSerialize 替换默认序列化
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

        // 设置value的序列化规则和 key的序列化规则
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    public void vagueDelete(String key){

        Set<Object> keys = redisTemplate.keys(key + "*");
        redisTemplate.delete(keys);
    }


}
