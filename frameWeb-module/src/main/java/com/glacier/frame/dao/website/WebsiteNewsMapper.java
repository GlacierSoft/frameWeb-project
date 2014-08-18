package com.glacier.frame.dao.website;

import com.glacier.frame.entity.website.WebsiteNews;
import com.glacier.frame.entity.website.WebsiteNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteNewsMapper {
    int countByExample(WebsiteNewsExample example);

    int deleteByExample(WebsiteNewsExample example);

    int deleteByPrimaryKey(String webNewsId);

    int insert(WebsiteNews record);

    int insertSelective(WebsiteNews record);

    List<WebsiteNews> selectByExampleWithBLOBs(WebsiteNewsExample example);

    List<WebsiteNews> selectByExample(WebsiteNewsExample example);

    WebsiteNews selectByPrimaryKey(String webNewsId);

    int updateByExampleSelective(@Param("record") WebsiteNews record, @Param("example") WebsiteNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") WebsiteNews record, @Param("example") WebsiteNewsExample example);

    int updateByExample(@Param("record") WebsiteNews record, @Param("example") WebsiteNewsExample example);

    int updateByPrimaryKeySelective(WebsiteNews record);

    int updateByPrimaryKeyWithBLOBs(WebsiteNews record);

    int updateByPrimaryKey(WebsiteNews record);
}