package com.li02.hy.dao;

import com.li02.hy.model.AyMood;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/*
 *@Author: lihaoyu
 *@Date:2019/3/29,15:59
 *@Description:
 *@Modified:
 */  
public interface AyMoodMapper {
    int deleteByPrimaryKey(String id);

    int insert(AyMood record);

    int insertSelective(AyMood record);

    AyMood selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AyMood record);

    int updateByPrimaryKey(AyMood record);

    int batchInsert(@Param("list") List<AyMood> list);
    List<AyMood>   findByUserIdAndPraiseNumLessThanOrEqualTo(@Param("userId")String userId,@Param("maxPraiseNum")Integer maxPraiseNum);

    int updateContentById(@Param("updatedContent")String updatedContent,@Param("id")String id);
   List<AyMood> findByContent(@Param("content")String content);

















}