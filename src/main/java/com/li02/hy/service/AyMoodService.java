package com.li02.hy.service;

import com.li02.hy.model.AyMood;

import java.util.List;

/*
 *@Author: lihaoyu
 *@Date:2019/3/29,15:59
 *@Description:
 *@Modified:
 */  
public interface AyMoodService{


    int deleteByPrimaryKey(String id);

    int insert(AyMood record);

    int insertSelective(AyMood record);

    AyMood selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AyMood record);

    int updateByPrimaryKey(AyMood record);

    int batchInsert(List<AyMood> list);



	List<AyMood> findByContent(String content);


}
