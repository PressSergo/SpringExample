package mains;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Forward implements ApplicationContextAware {
    private Singer singer;
    ApplicationContext applicationContext;

    public Singer getSinger() {
        return applicationContext.getBean("singer",Singer.class);
    }

    public void doSomething(){
        getSinger().Poy();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
