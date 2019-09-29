package InstrumetnLirick;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class inspiration {
    private String messageLyrick = "privat method";

    public inspiration(@Value("it is no private message))") String messageLyrick) {
        this.messageLyrick = messageLyrick;
    }

    public String getMessageLyrick() {
        return messageLyrick;
    }

    public void setMessageLyrick(String messageLyrick) {
        this.messageLyrick = messageLyrick;
    }
}
