package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.MemberSecretSecurity;
import com.glacier.frame.entity.member.MemberSecretSecurityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberSecretSecurityMapper {
    int countByExample(MemberSecretSecurityExample example);

    int deleteByExample(MemberSecretSecurityExample example);

    int deleteByPrimaryKey(String secretSecurityId);

    int insert(MemberSecretSecurity record);

    int insertSelective(MemberSecretSecurity record);

    List<MemberSecretSecurity> selectByExample(MemberSecretSecurityExample example);

    MemberSecretSecurity selectByPrimaryKey(String secretSecurityId);

    int updateByExampleSelective(@Param("record") MemberSecretSecurity record, @Param("example") MemberSecretSecurityExample example);

    int updateByExample(@Param("record") MemberSecretSecurity record, @Param("example") MemberSecretSecurityExample example);

    int updateByPrimaryKeySelective(MemberSecretSecurity record);

    int updateByPrimaryKey(MemberSecretSecurity record);
}