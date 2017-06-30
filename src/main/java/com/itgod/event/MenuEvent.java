package com.itgod.event;

/**
 * 自定义菜单事件
 * Created by Administrator on 2017/6/29.
 */
public class MenuEvent extends BaseEvent {
    //事件KEY值，与自然菜单接口中KEY值对应
    private String EventKey;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }
}
