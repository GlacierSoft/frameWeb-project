///*
// * @(#)MemberStatisticsService.java
// * @author xichao.dong
// * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
// */
//package com.glacier.frame.service.member;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.glacier.basic.util.RandomGUID;
//import com.glacier.frame.dao.member.MemberStatisticsMapper;
//import com.glacier.frame.dao.system.UserMapper;
//import com.glacier.frame.dto.query.member.MemBerStatisticsQueryDTO;
//import com.glacier.frame.entity.member.MemberStatistics;
//import com.glacier.frame.entity.member.MemberStatisticsExample;
//import com.glacier.frame.entity.member.MemberStatisticsExample.Criteria;
//import com.glacier.frame.entity.system.User;
//import com.glacier.frame.entity.system.UserExample;
//import com.glacier.jqueryui.util.JqGridReturn;
//import com.glacier.jqueryui.util.JqPager;
//import com.glacier.jqueryui.util.JqReturnJson;
//
///** 
// * @ClassName: MemberStatisticsService 
// * @Description: TODO(会员财务统计业务类) 
// * @author xichao.dong
// * @email 406592176@QQ.com
// * @date 2014-1-21 下午2:22:22  
// */
//@Service
//@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
//public class MemberStatisticsService {
//
//	@Autowired
//    private MemberStatisticsMapper statisticsMapper;
//	
//	@Autowired
//	private UserMapper userMapper;
//
//	
//	  public Object listMemberStatistics(){
//		    MemberStatisticsExample memberStatisticsExample = new MemberStatisticsExample();
//	    	JqPager pager = new JqPager();
//	    	pager.setSort("createTime");
//	    	pager.setOrder("DESC");
//	    	memberStatisticsExample.setOrderByClause(pager.getOrderBy("temp_member_statistics_"));
//	    	List<MemberStatistics>  memberStatisticss = statisticsMapper.selectByExample(memberStatisticsExample); // 查询所有会员积分列表
//	    	return memberStatisticss;
//	     }
//	    
//	/**
//	 * @Title: getStatistics
//	 * @Description: TODO(根据会员财务统计Id获取会员财务统计信息) 
//	 * @param @param memberStatisticsId
//	 * @param @return    设定文件 
//	 * @return Object    返回类型 
//	 * @throws
//	 */
//    public Object getStatistics(String statisticsId) {
//        return statisticsMapper.selectByPrimaryKey(statisticsId);
//    }
//    
//    /**
//     * @Title: getStatisticsByMember 
//     * @Description: TODO(根据所属会员Id获得该会员财务统计信息) 
//     * @param @param memberId
//     * @param @return    设定文件 
//     * @return Object    返回类型 
//     * @throws
//     */
//    public Object getStatisticsByMember(String memberId) {
//        return statisticsMapper.selectByMemberId(memberId);
//    }
//    
//    /**
//     * @Title: listAsGrid 
//     * @Description: TODO(获取所有会员财务统计信息) 
//     * @param @param jqPager
//     * @param @return    设定文件 
//     * @return Object    返回类型 
//     * @throws
//     */
//    public Object listAsGrid(JqPager jqPager,MemBerStatisticsQueryDTO memBerStatisticsQueryDTO) {
//        
//        JqGridReturn returnResult = new JqGridReturn();
//        MemberStatisticsExample memberStatisticsExample = new MemberStatisticsExample();
//        
//        Criteria queryCriteria = memberStatisticsExample.createCriteria();
//        memBerStatisticsQueryDTO.setQueryCondition(queryCriteria);
//
//        
//        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
//        	memberStatisticsExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
//        	memberStatisticsExample.setLimitEnd(jqPager.getRows());
//        }
//        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
//        	memberStatisticsExample.setOrderByClause(jqPager.getOrderBy("temp_member_statistics_"));
//        }
//        List<MemberStatistics>  memberStatisticss = statisticsMapper.selectByExample(memberStatisticsExample); // 查询所有会员积分列表
//        int total = statisticsMapper.countByExample(memberStatisticsExample); // 查询总页数
//        returnResult.setRows(memberStatisticss);
//        returnResult.setTotal(total);
//        return returnResult;// 返回ExtGrid表
//    }
//
//    /**
//     * @Title: addStatistics 
//     * @Description: TODO(新增会员财务统计) 
//     * @param @param statistics
//     * @param @return    设定文件 
//     * @return Object    返回类型 
//     * @throws
//     */
//    @Transactional(readOnly = false)
//    public Object addStatistics(MemberStatistics statistics) {
//    	//通过admin来获取超级管理员信息
//        UserExample userExample = new UserExample();
//        userExample.createCriteria().andUsernameEqualTo("admin");
//        List<User> users = userMapper.selectByExample(userExample);
//        
//        User pricipalUser = users.get(0);
//        
//        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
//        int count = 0;
//        statistics.setStatisticsId(RandomGUID.getRandomGUID());
//        statistics.setCreater(pricipalUser.getUserId());
//        statistics.setCreateTime(new Date());
//        statistics.setUpdater(pricipalUser.getUserId());
//        statistics.setUpdateTime(new Date());
//        count = statisticsMapper.insert(statistics);
//        if (count == 1) {
//            returnResult.setSuccess(true);
//            returnResult.setMsg("申请额度信息已保存");
//        } else {
//            returnResult.setMsg("发生未知错误，申请额度信息保存失败");
//        }
//        return returnResult;
//    }
//    
//    String[] excelHeader = {"会员","借款总额(元)","累计亏盈(元)","已还总额(元)","待还总额(元)","已收总额(元)","待收总额(元)","已还本金(元)","待还本金(元)","已还利息(元)","待还利息(元)","已收本金(元)","代收本金(元)","已收利息(元)","待收利息(元)","逾期罚款金额(元)","逾期利息总额(元)","借款管理费(元)","借款利息总额(元)","线下冲值奖励(元)",
//    		"借款成功次数","正常还款数","代还次数","投标成功数","会员停机时间"};	      
//     int[] excelHeaderWidth = {120,120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120, 120,120, 120, 120, 120,120};  
//  
//    //借款信息导出
//    public HSSFWorkbook export(List<MemberStatistics> list) {    
//        HSSFWorkbook wb = new HSSFWorkbook();    
//        HSSFSheet sheet = wb.createSheet("会员报表统计");    
//        HSSFRow row = sheet.createRow((int) 0);    
//       
//        // 生成一个样式  
//        HSSFCellStyle style = wb.createCellStyle();  
//        //设置这些样式  
//        style.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);  
//        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
//        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
//        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
//        style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
//        style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
//        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
//        // 生成另一个字体  
//        HSSFFont font= wb.createFont();  
//        font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);  
//        // 把字体应用到当前的样式  
//        style.setFont(font); 
//        
//        HSSFCellStyle style2 = wb.createCellStyle();  
//        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
//        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
//        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);  
//        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);  
//        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
//        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); 
//        
//        for (int i = 0; i < excelHeader.length; i++) {    
//            HSSFCell cell = row.createCell(i);    
//            cell.setCellValue(excelHeader[i]);    
//            cell.setCellStyle(style);    
//            sheet.autoSizeColumn(i);    
//        } 
//        // 设置列宽度（像素）  
//        for (int i = 0; i < excelHeaderWidth.length; i++) {  
//            sheet.setColumnWidth(i, 32 * excelHeaderWidth[i]);  
//        }
//        
//        //时间格式转化
//        SimpleDateFormat sf=new SimpleDateFormat("yyyy_MM_dd");
//        
//        for (int i = 0; i < list.size(); i++) { 
//        	//获取列值
//        	MemberStatistics memberStatistics = list.get(i);
//			//创建列
//			HSSFRow row_two=sheet.createRow(i + 1);
//			HSSFCell cell_Zero = row_two.createCell(0);
//			HSSFCell cell_One = row_two.createCell(1);
//			HSSFCell cell_Two = row_two.createCell(2);
//			HSSFCell cell_Three = row_two.createCell(3);
//			HSSFCell cell_Four = row_two.createCell(4);
//			HSSFCell cell_Five = row_two.createCell(5);
//			HSSFCell cell_Six = row_two.createCell(6);	
//			HSSFCell cell_Seven = row_two.createCell(7);
//			HSSFCell cell_Eight = row_two.createCell(8);
//			HSSFCell cell_Nine = row_two.createCell(9);
//			HSSFCell cell_Ten= row_two.createCell(10);
//			HSSFCell cell_eleven = row_two.createCell(11);
//			HSSFCell cell_twelve = row_two.createCell(12);
//			HSSFCell cell_thirteen= row_two.createCell(13);
//			HSSFCell cell_fourteen = row_two.createCell(14);
//			HSSFCell cell_fifteen= row_two.createCell(15);
//			HSSFCell cell_sixteen = row_two.createCell(16);
//			HSSFCell cell_seventeen = row_two.createCell(17);
//			HSSFCell cell_eightteen= row_two.createCell(18);
//			HSSFCell cell_nineteen= row_two.createCell(19);
//			HSSFCell cell_twenty= row_two.createCell(20);
//			HSSFCell cell_twenty_one= row_two.createCell(21);
//			HSSFCell cell_twenty_two= row_two.createCell(22);
//			HSSFCell cell_twenty_three=row_two.createCell(23);
//			HSSFCell cell_twenty_four=row_two.createCell(24);
//			
//			//格式转化
//			String value_one=((float)(Math.round(memberStatistics.getTotalBorrowings()*100))/100)+"";
//			String value_two=((float)(Math.round(memberStatistics.getCumulativeLossProfit()*100))/100)+"";
//			String value_three=((float)(Math.round(memberStatistics.getAlreadyTotal()*100))/100)+"";
//			String value_four=((float)(Math.round(memberStatistics.getWaitAlsoTotal()*100))/100)+"";
//			String value_five=((float)(Math.round(memberStatistics.getAlreadyIncomeTotal()*100))/100)+"";
//			String value_six=((float)(Math.round(memberStatistics.getWaitIncomeTotal()*100))/100)+"";
//			String value_seven=((float)(Math.round(memberStatistics.getAlreadyPrincipal()*100))/100)+"";
//			String value_eight=((float)(Math.round(memberStatistics.getWaitAlsoPrincipal()*100))/100)+"";
//			String value_nine=((float)(Math.round(memberStatistics.getAlreadyInterest()*100))/100)+"";
//			String value_ten=((float)(Math.round(memberStatistics.getWaitAlsoInterest()*100))/100)+"";
//			String value_eleven=((float)(Math.round(memberStatistics.getAlreadyIncomePrincipal()*100))/100)+"";
//			String value_twelve=((float)(Math.round(memberStatistics.getWaitIncomePrincipal()*100))/100)+"";
//			String value_thirteen=((float)(Math.round(memberStatistics.getAlreadyIncomeInterest()*100))/100)+"";
//			String value_fourteen=((float)(Math.round(memberStatistics.getWaitIncomePrincipal()*100))/100)+"";
//			String value_fifteen=((float)(Math.round(memberStatistics.getOverdueFineAmount())/100))+"";
//			String value_sixteen=((float)(Math.round(memberStatistics.getOverdueInterestAmount()*100))/100)+"";
//			String value_seventeen=((float)(Math.round(memberStatistics.getLoanManagementAmount()*100))/100)+"";
//			String value_eightteen=((float)(Math.round(memberStatistics.getLoanInterestAmount()*100))/100)+"";
//			String value_nineteen=((float)(Math.round(memberStatistics.getUplineDeltaAwards()*100))/100)+"";
//			
//		    cell_Zero.setCellValue(memberStatistics.getMemberRealName());
//			cell_One.setCellValue(value_one);//借款总额
//			cell_Two.setCellValue(value_two);//累计亏盈 
//			cell_Three.setCellValue(value_three);//已还总额
//			cell_Four.setCellValue(value_four);//待还总额
//			cell_Five.setCellValue(value_five);//已收总额
//			cell_Six.setCellValue(value_six);//待收总额
//			cell_Seven.setCellValue(value_seven);//已还本金
//			cell_Eight.setCellValue(value_eight);//待还本金
//			cell_Nine.setCellValue(value_nine);//已还利息
//			cell_Ten.setCellValue(value_ten);//待还利息
//			cell_eleven.setCellValue(value_eleven);//已收本金
//	        cell_twelve.setCellValue(value_twelve);//代收本金
//	        cell_thirteen.setCellValue(value_thirteen);//已收利息
//	        cell_fourteen.setCellValue(value_fourteen);//待收利息
//	        cell_fifteen.setCellValue(value_fifteen);//逾期罚款金额
//	        cell_sixteen.setCellValue(value_sixteen);//逾期利息总额
//	        cell_seventeen.setCellValue(value_seventeen);//借款管理费
//	        cell_eightteen.setCellValue(value_eightteen);// 借款利息总额
//	        cell_nineteen.setCellValue(value_nineteen);//线下冲值奖励
//	        cell_twenty.setCellValue(memberStatistics.getBorrowSuccess());//借款成功次数
//	        cell_twenty_one.setCellValue(memberStatistics.getNormalRepayment());//正常还款次数
//	        cell_twenty_two.setCellValue(memberStatistics.getWebsiteSubstitute());//网站待还次数
//	        cell_twenty_three.setCellValue(memberStatistics.getSuccessTender());//投标成功数
//	        cell_twenty_four.setCellValue(sf.format(memberStatistics.getCreateTime()));
//	        
//	        
//	        //列样式
//            cell_Zero.setCellStyle(style2);
//			cell_One.setCellStyle(style2);
//            cell_Two.setCellStyle(style2);
//			cell_Three.setCellStyle(style2);
//			cell_Four.setCellStyle(style2);
//			cell_Five.setCellStyle(style2);
//			cell_Six.setCellStyle(style2);
//			cell_Seven.setCellStyle(style2);
//			cell_Eight.setCellStyle(style2);
//			cell_Nine.setCellStyle(style2);
//			cell_Ten.setCellStyle(style2);
//			cell_eleven.setCellStyle(style2);
//			cell_twelve.setCellStyle(style2);
//			cell_thirteen.setCellStyle(style2);
//			cell_fourteen.setCellStyle(style2);
//			cell_fifteen.setCellStyle(style2);
//			cell_sixteen.setCellStyle(style2);
//			cell_seventeen.setCellStyle(style2);
//			cell_eightteen.setCellStyle(style2);
//			cell_nineteen.setCellStyle(style2);
//			cell_twenty.setCellStyle(style2);
//			cell_twenty_one.setCellStyle(style2);
//			cell_twenty_two.setCellStyle(style2);
//			cell_twenty_three.setCellStyle(style2);
//			cell_twenty_four.setCellStyle(style2);
//			
//	     }    
//        return wb;    
//    }     
//    
//    
//}
