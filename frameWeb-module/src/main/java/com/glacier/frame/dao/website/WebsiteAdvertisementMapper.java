package com.glacier.frame.dao.website;

import com.glacier.frame.entity.website.WebsiteAdvertisement;
import com.glacier.frame.entity.website.WebsiteAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteAdvertisementMapper {
    int countByExample(WebsiteAdvertisementExample example);

    int deleteByExample(WebsiteAdvertisementExample example);

    int deleteByPrimaryKey(String webAdvId);

    int insert(WebsiteAdvertisement record);

    int insertSelective(WebsiteAdvertisement record);

    List<WebsiteAdvertisement> selectByExampleWithBLOBs(WebsiteAdvertisementExample example);

    List<WebsiteAdvertisement> selectByExample(WebsiteAdvertisementExample example);

    WebsiteAdvertisement selectByPrimaryKey(String webAdvId);

    int updateByExampleSelective(@Param("record") WebsiteAdvertisement record, @Param("example") WebsiteAdvertisementExample example);

    int updateByExampleWithBLOBs(@Param("record") WebsiteAdvertisement record, @Param("example") WebsiteAdvertisementExample example);

    int updateByExample(@Param("record") WebsiteAdvertisement record, @Param("example") WebsiteAdvertisementExample example);

    int updateByPrimaryKeySelective(WebsiteAdvertisement record);

    int updateByPrimaryKeyWithBLOBs(WebsiteAdvertisement record);

    int updateByPrimaryKey(WebsiteAdvertisement record);
}