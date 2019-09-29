package MessageSupportFactory;

/*
Добавляя фабрику мы отделяем процесс получения данных от их использования
мы загружаем данные в фабрике из класса , при этом можем менять различные параметры
аналогичное не возможно, если мы используем стандар
 */

import Interface_provider_render.MessageProvider;
import Interface_provider_render.MessageRender;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private MessageProvider messageProvider;
    private MessageRender messageRender;
    private Properties properties;

    private MessageSupportFactory(){
        properties = new Properties();

        try{
            properties.load(this.getClass().getResourceAsStream("/props"));
            String provider = properties.getProperty("provide.class");
            String render = properties.getProperty("render.class");

            messageProvider = (MessageProvider) Class.forName(provider).newInstance();
            messageRender = (MessageRender) Class.forName(render).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    public MessageRender getMessageRender() {
        return messageRender;
    }

    public Properties getProperties() {
        return properties;
    }
}
