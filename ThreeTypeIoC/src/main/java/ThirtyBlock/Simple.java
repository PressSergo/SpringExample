package ThirtyBlock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("simple")
public class Simple {
    @Value("this is a third value")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
