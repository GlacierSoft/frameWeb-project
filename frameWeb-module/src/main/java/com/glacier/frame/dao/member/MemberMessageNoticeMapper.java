package com.glacier.frame.dao.member;

import com.glacier.frame.entity.member.MemberMessageNotice;
import com.glacier.frame.entity.member.MemberMessageNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMessageNoticeMapper {
    int countByExample(MemberMessageNoticeExample example);

    int deleteByExample(MemberMessageNoticeExample example);

    int deleteByPrimaryKey(String messageNoticeId);

    int insert(MemberMessageNotice record);

    int insertSelective(MemberMessageNotice record);

    List<MemberMessageNotice> selectByExample(MemberMessageNoticeExample example);

    MemberMessageNotice selectByPrimaryKey(String messageNoticeId);

    int updateByExampleSelective(@Param("record") MemberMessageNotice record, @Param("example") MemberMessageNoticeExample example);

    int updateByExample(@Param("record") MemberMessageNotice record, @Param("example") MemberMessageNoticeExample example);

    int updateByPrimaryKeySelective(MemberMessageNotice record);

    int updateByPrimaryKey(MemberMessageNotice record);
}