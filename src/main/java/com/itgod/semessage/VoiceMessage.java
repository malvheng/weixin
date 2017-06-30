package com.itgod.semessage;
import com.itgod.model.Voice;

/**
 * Created by Administrator on 2017/6/29.
 */
public class VoiceMessage extends  BaseMessage {
    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }
}
