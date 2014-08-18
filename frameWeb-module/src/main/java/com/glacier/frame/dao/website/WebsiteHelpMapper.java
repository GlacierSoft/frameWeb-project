package com.glacier.frame.dao.website;

import com.glacier.frame.entity.website.WebsiteHelp;
import com.glacier.frame.entity.website.WebsiteHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteHelpMapper {
    int countByExample(WebsiteHelpExample example);

    int deleteByExample(WebsiteHelpExample example);

    int deleteByPrimaryKey(String webHelpId);

    int insert(WebsiteHelp record);

    int insertSelective(WebsiteHelp record);

    List<WebsiteHelp> selectByExampleWithBLOBs(WebsiteHelpExample example);

    List<WebsiteHelp> selectByExample(WebsiteHelpExample example);

    WebsiteHelp selectByPrimaryKey(String webHelpId);

    int updateByExampleSelective(@Param("record") WebsiteHelp record, @Param("example") WebsiteHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") WebsiteHelp record, @Param("example") WebsiteHelpExample example);

    int updateByExample(@Param("record") WebsiteHelp record, @Param("example") WebsiteHelpExample example);

    int updateByPrimaryKeySelective(WebsiteHelp record);

    int updateByPrimaryKeyWithBLOBs(WebsiteHelp record);

    int updateByPrimaryKey(WebsiteHelp record);
}