package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterIntegralType;
import com.glacier.frame.entity.basicdatas.ParameterIntegralTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterIntegralTypeMapper {
    int countByExample(ParameterIntegralTypeExample example);

    int deleteByExample(ParameterIntegralTypeExample example);

    int deleteByPrimaryKey(String integralTypeId);

    int insert(ParameterIntegralType record);

    int insertSelective(ParameterIntegralType record);

    List<ParameterIntegralType> selectByExample(ParameterIntegralTypeExample example);

    ParameterIntegralType selectByPrimaryKey(String integralTypeId);

    int updateByExampleSelective(@Param("record") ParameterIntegralType record, @Param("example") ParameterIntegralTypeExample example);

    int updateByExample(@Param("record") ParameterIntegralType record, @Param("example") ParameterIntegralTypeExample example);

    int updateByPrimaryKeySelective(ParameterIntegralType record);

    int updateByPrimaryKey(ParameterIntegralType record);
}