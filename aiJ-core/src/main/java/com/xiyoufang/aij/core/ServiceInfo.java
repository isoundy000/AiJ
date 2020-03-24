package com.xiyoufang.aij.core;

/**
 * Created by 席有芳 on 2019-02-03.
 *
 * @author 席有芳
 */
public class ServiceInfo {

    /**
     * 服务id
     */
    private int id;
    /**
     * 服务Code
     */
    private int code;
    /**
     * 服务名称
     */
    private String name;
    /**
     * 服务类型
     */
    private ServiceType type;
    /**
     * 服务描述
     */
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceType getType() {
        return type;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
