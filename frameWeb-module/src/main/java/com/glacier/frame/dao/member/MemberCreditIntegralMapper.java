package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.MemberCreditIntegral;
import com.glacier.frame.entity.member.MemberCreditIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberCreditIntegralMapper {
    int countByExample(MemberCreditIntegralExample example);

    int deleteByExample(MemberCreditIntegralExample example);

    int deleteByPrimaryKey(String creditIntegralId);

    int insert(MemberCreditIntegral record);

    int insertSelective(MemberCreditIntegral record);

    List<MemberCreditIntegral> selectByExample(MemberCreditIntegralExample example);

    MemberCreditIntegral selectByPrimaryKey(String creditIntegralId);

    int updateByExampleSelective(@Param("record") MemberCreditIntegral record, @Param("example") MemberCreditIntegralExample example);

    int updateByExample(@Param("record") MemberCreditIntegral record, @Param("example") MemberCreditIntegralExample example);

    int updateByPrimaryKeySelective(MemberCreditIntegral record);

    int updateByPrimaryKey(MemberCreditIntegral record);
}