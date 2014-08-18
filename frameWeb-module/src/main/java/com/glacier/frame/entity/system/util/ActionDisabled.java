/*
 * @(#)ActionDisabled.java
 * @author zhenfei.zhang 
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.entity.system.util;

/** 
 * @ClassName: ActionDisabled 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author zhenfei.zhang 
 * @email zhangzhenfei_email@163.com 
 * @date 2013-8-26 上午10:11:36  
 */
public enum ActionDisabled {
    /**
     * 返回true表示禁用按钮
     */
    Enabled(false),Disabled(true);
    
    private ActionDisabled(){};
    
    private ActionDisabled(boolean value){
        this.value = value;
    };
    
    private boolean value;

    public boolean getValue() {
        return value;
    }
}
