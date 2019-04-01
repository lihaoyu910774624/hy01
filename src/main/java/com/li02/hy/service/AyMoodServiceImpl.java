package com.li02.hy.service;

import com.li02.hy.dao.AyMoodMapper;
import com.li02.hy.model.AyMood;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 *@Author: lihaoyu
 *@Date:2019/3/29,15:59
 *@Description:
 *@Modified:
 */  
@Service
public class AyMoodServiceImpl implements AyMoodService{
    @Override
    public List<AyMood> findByContent(String content) {
        return ayMoodMapper.findByContent(content);
    }

    @Resource
    private AyMoodMapper ayMoodMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return ayMoodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AyMood record) {
        return ayMoodMapper.insert(record);
    }

    @Override
    public int insertSelective(AyMood record) {
        return ayMoodMapper.insertSelective(record);
    }

    @Override
    public AyMood selectByPrimaryKey(String id) {
        return ayMoodMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AyMood record) {
        return ayMoodMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AyMood record) {
        return ayMoodMapper.updateByPrimaryKey(record);
    }



    @Override
    public int batchInsert(List<AyMood> list) {
        return ayMoodMapper.batchInsert(list);
    }

}
