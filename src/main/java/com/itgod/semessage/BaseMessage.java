package com.itgod.semessage;

/**
 * 消息基类（公众账号->普通用户）
 * Created by Administrator on 2017/6/29.
 */
public class BaseMessage {
    //接收方账号（收到OpenID）
    private String ToUserName;
    //开发者微信号
    private String FromUserName;
    //消息创建事件(整形)
    private long CreateTime;
    //消息类型

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    private String MsgType;


}
