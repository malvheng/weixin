package com.itgod.remessage;

/**
 * 文本内容
 * Created by Administrator on 2017/6/29.
 */
public class TextMessage extends BaseMessage {
    //消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
