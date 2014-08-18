package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.MemberWork;
import com.glacier.frame.entity.member.MemberWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberWorkMapper {
    int countByExample(MemberWorkExample example);

    int deleteByExample(MemberWorkExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MemberWork record);

    int insertSelective(MemberWork record);

    List<MemberWork> selectByExample(MemberWorkExample example);

    MemberWork selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MemberWork record, @Param("example") MemberWorkExample example);

    int updateByExample(@Param("record") MemberWork record, @Param("example") MemberWorkExample example);

    int updateByPrimaryKeySelective(MemberWork record);

    int updateByPrimaryKey(MemberWork record);
}