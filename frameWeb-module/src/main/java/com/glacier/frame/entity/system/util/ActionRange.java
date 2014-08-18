/**
 * @Title: ActionRange.java 
 * @Package com.glacier.permission.entity.util 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2013-12-24 下午4:21:08 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2013-12-24
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.entity.system.util;

/**
 * @ClassName: ActionRange 
 * @Description: TODO(动作范围) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2013-12-24 下午4:21:08
 */
public enum ActionRange {
    
    ALL(0),DEPC(1),DEP(2),SELF(3);
    
    private ActionRange(){};
    
    private ActionRange(int value){
        this.value = value;
    };
    
    private int value;

    public int getValue() {
        return value;
    }

}
