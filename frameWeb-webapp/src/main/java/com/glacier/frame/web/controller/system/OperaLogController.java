/**
 * @Title: OperaLogController.java 
 * @Package com.glacier.frame.web.controller.system 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-10 下午3:27:17 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-10
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.web.controller.system;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.dto.query.system.OperalogQueryDTO;
import com.glacier.frame.service.system.OperaLogService;

/**
 * @ClassName: OperaLogController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-10 下午3:27:17
 */
@Controller
@RequestMapping(value = "/operalog")
public class OperaLogController {

    @Autowired
    private OperaLogService operaLogService;// 注入角色业务Bean

    // 进入操作日志列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("system_mgr/operalog_mgr/operalog");
        return mav;
    }

    // 获取表格结构的所有操作日志数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(OperalogQueryDTO operalogQueryDTO,JqPager pager) {
        return operaLogService.listAsGrid(operalogQueryDTO,pager);
    }
    
    // 进入客服Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoOperaLogDetailPage(String operalogId) {
        ModelAndView mav = new ModelAndView("system_mgr/operalog_mgr/operalog_detail");
        if(StringUtils.isNotBlank(operalogId)){
            mav.addObject("operaLogData", operaLogService.getOperaLog(operalogId));
        }
        return mav;
    }
    
    //删除操作日志数据
    @RequestMapping(value = "/del.json",method = RequestMethod.POST)
    @ResponseBody
    private Object delOperaLog(@RequestParam List<String> operalogIds,@RequestParam List<String> operaPenals){
    	return operaLogService.delOperaLog(operalogIds, operaPenals);
    }
}
