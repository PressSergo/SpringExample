package Event;

import org.springframework.context.ApplicationEvent;

public class SimplyEvent extends ApplicationEvent {
    private String msg;

    public SimplyEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }
}
