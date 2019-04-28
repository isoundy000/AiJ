package com.xiyoufang.aij.room.response;

import com.xiyoufang.aij.response.CommonResponse;

/**
 * Created by 席有芳 on 2018-12-20.
 *
 * @author 席有芳
 */
public class HeroSitDownEventResponse extends CommonResponse {
    /**
     * 椅子
     */
    private int chair;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
