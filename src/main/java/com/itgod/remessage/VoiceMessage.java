package com.itgod.remessage;

/**
 * 语音消息类的代码
 * Created by Administrator on 2017/6/29.
 */
public class VoiceMessage extends BaseMessage {
    //媒体ID
    private String MediaId;
    //语音格式
    private String Format;
    //语音识别结果
    private String Recognition;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        Recognition = recognition;
    }
}
