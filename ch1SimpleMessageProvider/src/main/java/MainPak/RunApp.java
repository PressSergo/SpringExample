package MainPak;

import Interface_provider_render.MessageProvider;
import Interface_provider_render.MessageRender;
import MessageSupportFactory.MessageSupportFactory;
import configurate.Configurate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import realiseInterface.HelloWorldMessageProvider;
import realiseInterface.StandartOutMessageRender;

public class RunApp {
    public static void main(String[] args){
//        MessageRender messageRender = new StandartOutMessageRender();
//        MessageProvider messageProvider = new HelloWorldMessageProvider();
//
//        messageRender.setMessageProvider(messageProvider);
//        messageRender.render();


//        MessageRender messageRender = MessageSupportFactory.getInstance().getMessageRender();
//        MessageProvider messageProvider = MessageSupportFactory.getInstance().getMessageProvider();
//        messageRender.setMessageProvider(messageProvider);
//        messageRender.render();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/contex.xml");
//        MessageRender messageRender = applicationContext.getBean("render",MessageRender.class);
//        messageRender.render();

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configurate.class);
//        MessageRender messageRender = applicationContext.getBean("render",MessageRender.class);
//        messageRender.render();

        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load(new ClassPathResource("/spring/forClass.xml"));
        genericXmlApplicationContext.refresh();
        MessageRender messageRender = genericXmlApplicationContext.getBean("render",MessageRender.class);
        messageRender.render();

        MessageProvider messageProvider = genericXmlApplicationContext.getBean("prov",MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
