package com.glacier.frame.entity.system;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.frame.entity.common.util.CommonBuiltin;

public class Role {
    /**
     * 角色主键ID
     */
    private String roleId;

    /**
     * 角色英文名 字母组成，长度为2-25
     */
    @Pattern(regexp = "^[A-Z_]{2,16}$", message = "{Role.roleEnName.illegal}")
    private String roleEnName;

    /**
     * 角色名
     */
    @Pattern(regexp = "^[\\u4E00-\\u9FA5\\uf900-\\ufa2d\\w]{2,16}$", message = "{Role.roleCnName.illegal}")
    private String roleCnName;

    private CommonBuiltin builtin;

    private String remark;

    private String creater;

    /**
     * 自定义字段：创建者显示字段
     */
    private String createrDisplay;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    private boolean checked;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleEnName() {
        return roleEnName;
    }

    public void setRoleEnName(String roleEnName) {
        this.roleEnName = roleEnName;
    }

    public String getRoleCnName() {
        return roleCnName;
    }

    public void setRoleCnName(String roleCnName) {
        this.roleCnName = roleCnName;
    }

    public CommonBuiltin getBuiltin() {
        return builtin;
    }

    public void setBuiltin(CommonBuiltin builtin) {
        this.builtin = builtin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCreaterDisplay() {
        return createrDisplay;
    }

    public void setCreaterDisplay(String createrDisplay) {
        this.createrDisplay = createrDisplay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}