package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterCreditType;
import com.glacier.frame.entity.basicdatas.ParameterCreditTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterCreditTypeMapper {
    int countByExample(ParameterCreditTypeExample example);

    int deleteByExample(ParameterCreditTypeExample example);

    int deleteByPrimaryKey(String creditTypeId);

    int insert(ParameterCreditType record);

    int insertSelective(ParameterCreditType record);

    List<ParameterCreditType> selectByExample(ParameterCreditTypeExample example);

    ParameterCreditType selectByPrimaryKey(String creditTypeId);

    int updateByExampleSelective(@Param("record") ParameterCreditType record, @Param("example") ParameterCreditTypeExample example);

    int updateByExample(@Param("record") ParameterCreditType record, @Param("example") ParameterCreditTypeExample example);

    int updateByPrimaryKeySelective(ParameterCreditType record);

    int updateByPrimaryKey(ParameterCreditType record);
}