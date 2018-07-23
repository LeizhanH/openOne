package com.erma.dao;

import com.erma.model.Lp;

public interface LpMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Lp record);

    int insertSelective(Lp record);

    Lp selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Lp record);

    int updateByPrimaryKey(Lp record);
}