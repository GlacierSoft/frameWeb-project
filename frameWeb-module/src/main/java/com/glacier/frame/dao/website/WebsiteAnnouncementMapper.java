package com.glacier.frame.dao.website;

import com.glacier.frame.entity.website.WebsiteAnnouncement;
import com.glacier.frame.entity.website.WebsiteAnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteAnnouncementMapper {
    int countByExample(WebsiteAnnouncementExample example);

    int deleteByExample(WebsiteAnnouncementExample example);

    int deleteByPrimaryKey(String webAnnId);

    int insert(WebsiteAnnouncement record);

    int insertSelective(WebsiteAnnouncement record);

    List<WebsiteAnnouncement> selectByExampleWithBLOBs(WebsiteAnnouncementExample example);

    List<WebsiteAnnouncement> selectByExample(WebsiteAnnouncementExample example);

    WebsiteAnnouncement selectByPrimaryKey(String webAnnId);

    int updateByExampleSelective(@Param("record") WebsiteAnnouncement record, @Param("example") WebsiteAnnouncementExample example);

    int updateByExampleWithBLOBs(@Param("record") WebsiteAnnouncement record, @Param("example") WebsiteAnnouncementExample example);

    int updateByExample(@Param("record") WebsiteAnnouncement record, @Param("example") WebsiteAnnouncementExample example);

    int updateByPrimaryKeySelective(WebsiteAnnouncement record);

    int updateByPrimaryKeyWithBLOBs(WebsiteAnnouncement record);

    int updateByPrimaryKey(WebsiteAnnouncement record);
}