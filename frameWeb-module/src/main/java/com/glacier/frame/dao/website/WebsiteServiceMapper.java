package com.glacier.frame.dao.website;

import com.glacier.frame.entity.website.WebsiteService;
import com.glacier.frame.entity.website.WebsiteServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteServiceMapper {
    int countByExample(WebsiteServiceExample example);

    int deleteByExample(WebsiteServiceExample example);

    int deleteByPrimaryKey(String webServiceId);

    int insert(WebsiteService record);

    int insertSelective(WebsiteService record);

    List<WebsiteService> selectByExample(WebsiteServiceExample example);

    WebsiteService selectByPrimaryKey(String webServiceId);

    int updateByExampleSelective(@Param("record") WebsiteService record, @Param("example") WebsiteServiceExample example);

    int updateByExample(@Param("record") WebsiteService record, @Param("example") WebsiteServiceExample example);

    int updateByPrimaryKeySelective(WebsiteService record);

    int updateByPrimaryKey(WebsiteService record);
}