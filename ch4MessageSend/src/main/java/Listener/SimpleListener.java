package Listener;

import Event.SimplyEvent;
import org.springframework.context.ApplicationListener;


public class SimpleListener implements ApplicationListener<SimplyEvent> {
    @Override
    public void onApplicationEvent(SimplyEvent simplyEvent) {
        System.out.println(simplyEvent.getMsg());
    }
}
