/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package toString;

import java.io.Serializable;
import java.util.Date;

public class ApocalypseBusinessDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer           id;

    /**
     * 指令类型名
     */
    private String           apTaskName;

    /**
     * 指令类型ID
     */
    private Integer           commandTypeId;

    /**
     * 业务目标名称
     */
    private String            commandTypeName;

    /**
     * 指令业务类型
     */
    private Integer            commandType;

    /**
     * 指令动作
     */
    private String            commandAction;

    /**
     * 指令业务动作对应业务参数,json字符串
     */
    private String            commandParam;

    /**
     * 创建人
     */
    private String            createPerson;

    /**
     * 创建时间
     */
    private Date              createTime;

    /**
     * 更新人
     */
    private String            updatePerson;

    /**
     * 更新时间
     */
    private Date              updateTime;

    /**
     * 隐藏Delete操作
     */
    private String              noDelete;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApTaskName() {
        return apTaskName;
    }

    public void setApTaskName(String apTaskName) {
        this.apTaskName = apTaskName;
    }

    public Integer getCommandTypeId() {
        return commandTypeId;
    }

    public void setCommandTypeId(Integer commandTypeId) {
        this.commandTypeId = commandTypeId;
    }

    public String getCommandTypeName() {
        return commandTypeName;
    }

    public void setCommandTypeName(String commandTypeName) {
        this.commandTypeName = commandTypeName;
    }

    public Integer getCommandType() {
        return commandType;
    }

    public void setCommandType(Integer commandType) {
        this.commandType = commandType;
    }

    public String getCommandAction() {
        return commandAction;
    }

    public void setCommandAction(String commandAction) {
        this.commandAction = commandAction;
    }

    public String getCommandParam() {
        return commandParam;
    }

    public void setCommandParam(String commandParam) {
        this.commandParam = commandParam;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getNoDelete() {
        return noDelete;
    }

    public void setNoDelete(String noDelete) {
        this.noDelete = noDelete;
    }

/*    @Override
    public String toString() {
        return "ApocalypseBusinessDO{" +
                "id=" + id +
                ", apTaskName='" + apTaskName + '\'' +
                ", commandTypeId=" + commandTypeId +
                ", commandTypeName='" + commandTypeName + '\'' +
                ", commandType=" + commandType +
                ", commandAction='" + commandAction + '\'' +
                ", commandParam='" + commandParam + '\'' +
                ", createPerson='" + createPerson + '\'' +
                ", createTime=" + createTime +
                ", updatePerson='" + updatePerson + '\'' +
                ", updateTime=" + updateTime +
                ", noDelete='" + noDelete + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return getClass().getName() +
                "{" +
                "id=" + id +
                ", apTaskName='" + apTaskName + '\'' +
                ", commandTypeId=" + commandTypeId +
                ", commandTypeName='" + commandTypeName + '\'' +
                ", commandType=" + commandType +
                ", commandAction='" + commandAction + '\'' +
                ", commandParam='" + commandParam + '\'' +
                ", createPerson='" + createPerson + '\'' +
                ", createTime=" + createTime +
                ", updatePerson='" + updatePerson + '\'' +
                ", updateTime=" + updateTime +
                ", noDelete='" + noDelete + '\'' +
                '}';
    }
}