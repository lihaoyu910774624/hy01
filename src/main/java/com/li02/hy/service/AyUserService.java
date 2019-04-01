package com.li02.hy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.li02.hy.dao.AyUserMapper;
import com.li02.hy.model.AyUser;

/*
 *@Author: lihaoyu
 *@Date:2019/3/29,15:57
 *@Description:
 *@Modified:
 */  
@Service
public class AyUserService{

    @Resource
    private AyUserMapper ayUserMapper;

    
    public int deleteByPrimaryKey(String id) {
        return ayUserMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(AyUser record) {
        return ayUserMapper.insert(record);
    }

    
    public int insertSelective(AyUser record) {
        return ayUserMapper.insertSelective(record);
    }

    
    public AyUser selectByPrimaryKey(String id) {
        return ayUserMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(AyUser record) {
        return ayUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(AyUser record) {
        return ayUserMapper.updateByPrimaryKey(record);
    }

}
