package configurate;

import Interface_provider_render.MessageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import realiseInterface.HelloWorldMessageProvider;

@Configuration
public class ConfigurateMessage {

    @Bean(name = "prov")
    public MessageProvider getMessageProvider(){
        return new HelloWorldMessageProvider();
    }
}
