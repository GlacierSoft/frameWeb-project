package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterQuestion;
import com.glacier.frame.entity.basicdatas.ParameterQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterQuestionMapper {
    int countByExample(ParameterQuestionExample example);

    int deleteByExample(ParameterQuestionExample example);

    int deleteByPrimaryKey(String questionId);

    int insert(ParameterQuestion record);

    int insertSelective(ParameterQuestion record);

    List<ParameterQuestion> selectByExample(ParameterQuestionExample example);

    ParameterQuestion selectByPrimaryKey(String questionId);

    int updateByExampleSelective(@Param("record") ParameterQuestion record, @Param("example") ParameterQuestionExample example);

    int updateByExample(@Param("record") ParameterQuestion record, @Param("example") ParameterQuestionExample example);

    int updateByPrimaryKeySelective(ParameterQuestion record);

    int updateByPrimaryKey(ParameterQuestion record);
}