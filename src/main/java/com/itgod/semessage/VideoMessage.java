package com.itgod.semessage;
import com.itgod.model.Video;
/**
 * 视频消息
 * Created by Administrator on 2017/6/29.
 */
public class VideoMessage extends BaseMessage {
    //视频
    private Video Video;

    public Video getVideo() {
        return Video;
    }

    public void setVideo(Video video) {
        Video = video;
    }
}
