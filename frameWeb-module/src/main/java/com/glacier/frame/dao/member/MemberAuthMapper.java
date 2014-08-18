package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.MemberAuth;
import com.glacier.frame.entity.member.MemberAuthExample;
import com.glacier.frame.entity.member.MemberAuthWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberAuthMapper {
    int countByExample(MemberAuthExample example);

    int deleteByExample(MemberAuthExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MemberAuthWithBLOBs record);

    int insertSelective(MemberAuthWithBLOBs record);

    List<MemberAuthWithBLOBs> selectByExampleWithBLOBs(MemberAuthExample example);

    List<MemberAuth> selectByExample(MemberAuthExample example);

    MemberAuthWithBLOBs selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MemberAuthWithBLOBs record, @Param("example") MemberAuthExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberAuthWithBLOBs record, @Param("example") MemberAuthExample example);

    int updateByExample(@Param("record") MemberAuth record, @Param("example") MemberAuthExample example);

    int updateByPrimaryKeySelective(MemberAuthWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MemberAuthWithBLOBs record);

    int updateByPrimaryKey(MemberAuth record);
}