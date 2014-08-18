package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.MemberToken;
import com.glacier.frame.entity.member.MemberTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTokenMapper {
    int countByExample(MemberTokenExample example);

    int deleteByExample(MemberTokenExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MemberToken record);

    int insertSelective(MemberToken record);

    List<MemberToken> selectByExample(MemberTokenExample example);

    MemberToken selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);

    int updateByExample(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);

    int updateByPrimaryKeySelective(MemberToken record);

    int updateByPrimaryKey(MemberToken record);
}