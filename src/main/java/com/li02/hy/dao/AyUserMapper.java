package com.li02.hy.dao;
import com.li02.hy.model.AyMood;
import com.li02.hy.model.AyUser;

import java.util.List;


/*
 *@Author: lihaoyu
 *@Date:2019/3/29,15:57
 *@Description:
 *@Modified:
 */  
public interface AyUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(AyUser record);

    int insertSelective(AyUser record);

    AyUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AyUser record);

    int updateByPrimaryKey(AyUser record);



	List<AyMood> findByContent(String content);

}