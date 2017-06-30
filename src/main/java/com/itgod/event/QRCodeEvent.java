package com.itgod.event;

/**
 *扫描二维码事件
 * Created by Administrator on 2017/6/29.
 */
public class QRCodeEvent extends BaseEvent {
    //事件KEY值
    private String EventKey;
    //用于换取二维码图片
    private String TicKet;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicKet() {
        return TicKet;
    }

    public void setTicKet(String ticKet) {
        TicKet = ticKet;
    }
}
