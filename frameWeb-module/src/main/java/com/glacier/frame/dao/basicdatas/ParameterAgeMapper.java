package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterAge;
import com.glacier.frame.entity.basicdatas.ParameterAgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterAgeMapper {
    int countByExample(ParameterAgeExample example);

    int deleteByExample(ParameterAgeExample example);

    int deleteByPrimaryKey(String ageId);

    int insert(ParameterAge record);

    int insertSelective(ParameterAge record);

    List<ParameterAge> selectByExample(ParameterAgeExample example);

    ParameterAge selectByPrimaryKey(String ageId);

    int updateByExampleSelective(@Param("record") ParameterAge record, @Param("example") ParameterAgeExample example);

    int updateByExample(@Param("record") ParameterAge record, @Param("example") ParameterAgeExample example);

    int updateByPrimaryKeySelective(ParameterAge record);

    int updateByPrimaryKey(ParameterAge record);
}