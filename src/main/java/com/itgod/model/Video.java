package com.itgod.model;

/**
 * 视屏model
 * Created by Administrator on 2017/6/29.
 */
public class Video {
    //媒体文件ID
    private String MediaId;
    //缩略图的媒体ID
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
