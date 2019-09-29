package realiseInterface;

import Interface_provider_render.MessageProvider;
import Interface_provider_render.MessageRender;

public class StandartOutMessageRender implements MessageRender {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        System.out.println("[Standart out]: "+messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
