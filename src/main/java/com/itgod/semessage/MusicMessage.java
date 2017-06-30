package com.itgod.semessage;
import com.itgod.model.Music;

/**
 * 音乐消息
 * Created by Administrator on 2017/6/29.
 */
public class MusicMessage extends BaseMessage {
    //音乐
    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        Music = music;
    }
}
