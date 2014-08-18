package com.glacier.frame.dao.website;

import com.glacier.frame.entity.website.WebsiteHiring;
import com.glacier.frame.entity.website.WebsiteHiringExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteHiringMapper {
    int countByExample(WebsiteHiringExample example);

    int deleteByExample(WebsiteHiringExample example);

    int deleteByPrimaryKey(String webHiringId);

    int insert(WebsiteHiring record);

    int insertSelective(WebsiteHiring record);

    List<WebsiteHiring> selectByExampleWithBLOBs(WebsiteHiringExample example);

    List<WebsiteHiring> selectByExample(WebsiteHiringExample example);

    WebsiteHiring selectByPrimaryKey(String webHiringId);

    int updateByExampleSelective(@Param("record") WebsiteHiring record, @Param("example") WebsiteHiringExample example);

    int updateByExampleWithBLOBs(@Param("record") WebsiteHiring record, @Param("example") WebsiteHiringExample example);

    int updateByExample(@Param("record") WebsiteHiring record, @Param("example") WebsiteHiringExample example);

    int updateByPrimaryKeySelective(WebsiteHiring record);

    int updateByPrimaryKeyWithBLOBs(WebsiteHiring record);

    int updateByPrimaryKey(WebsiteHiring record);
}