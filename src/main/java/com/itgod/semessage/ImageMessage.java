package com.itgod.semessage;

import com.itgod.model.Image;

/**
 * 图片消息
 * Created by Administrator on 2017/6/29.
 */
public class ImageMessage extends  BaseMessage{
    //图片
    private Image Image;

    public com.itgod.model.Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}
