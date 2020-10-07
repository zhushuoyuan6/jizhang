package com.kgc.zhang.mapper;

import com.kgc.zhang.entity.Billtype;
import com.kgc.zhang.entity.BilltypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BilltypeMapper {
    int countByExample(BilltypeExample example);

    int deleteByExample(BilltypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Billtype record);

    int insertSelective(Billtype record);

    List<Billtype> selectByExample(BilltypeExample example);

    Billtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Billtype record, @Param("example") BilltypeExample example);

    int updateByExample(@Param("record") Billtype record, @Param("example") BilltypeExample example);

    int updateByPrimaryKeySelective(Billtype record);

    int updateByPrimaryKey(Billtype record);
}