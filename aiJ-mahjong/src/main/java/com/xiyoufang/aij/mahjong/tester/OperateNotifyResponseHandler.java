package com.xiyoufang.aij.mahjong.tester;

import com.neovisionaries.ws.client.WebSocket;
import com.xiyoufang.aij.mahjong.response.OperateNotifyEventResponse;
import com.xiyoufang.aij.room.tester.ResponseHandler;
import com.xiyoufang.aij.room.tester.TesterHero;
import org.greenrobot.eventbus.EventBus;

/**
 * Created by 席有芳 on 2018-12-26.
 *
 * @author 席有芳
 */
public class OperateNotifyResponseHandler extends ResponseHandler<OperateNotifyEventResponse> {

    public OperateNotifyResponseHandler() {
        super(OperateNotifyEventResponse.class);
    }

    /**
     * 转换后的对象Handler
     *
     * @param testerHero testerHero
     * @param response   response
     * @param webSocket  webSocket
     */
    @Override
    protected void doHandle(TesterHero testerHero, OperateNotifyEventResponse response, WebSocket webSocket) {
        EventBus.getDefault().post(response);
    }
}
