package configurate;

import Interface_provider_render.MessageProvider;
import Interface_provider_render.MessageRender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import realiseInterface.HelloWorldMessageProvider;
import realiseInterface.StandartOutMessageRender;

@ComponentScan(basePackageClasses = {ConfigurateMessage.class})
@Configuration
public class Configurate {

    @Bean(name = "render")
    @Autowired
    @Qualifier("prov")
    public MessageRender messageRender(MessageProvider messageProvider){
        MessageRender messageRender = new StandartOutMessageRender();
        messageRender.setMessageProvider(messageProvider);
        return messageRender;
    }
}
