package mains;

import Listener.SimpleListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import publisher.Publisher;

public class mains {
    public static void main(String[] args){
        GenericXmlApplicationContext classPathXmlApplicationContext = new GenericXmlApplicationContext("/appl.xml");
        Publisher publisher = classPathXmlApplicationContext.getBean("publisher", Publisher.class);
        SimpleListener simpleListener = classPathXmlApplicationContext.getBean("listener",SimpleListener.class);
        SimpleListener simpleListener2 = classPathXmlApplicationContext.getBean("listener",SimpleListener.class);

        publisher.publish("haha classil");
        publisher.publish("are you not RabbitMQ");

        classPathXmlApplicationContext.close();
    }
}
