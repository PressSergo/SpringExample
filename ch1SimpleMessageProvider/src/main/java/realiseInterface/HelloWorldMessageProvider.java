package realiseInterface;

import Interface_provider_render.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world my friend";
    }
}
