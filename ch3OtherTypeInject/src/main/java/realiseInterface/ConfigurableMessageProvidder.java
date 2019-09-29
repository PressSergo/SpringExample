package realiseInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@ImportResource(locations = "resources/configs.xml")
@Service("provider")
public class ConfigurableMessageProvidder {
    private String message;

    public String getMessage() {
        return message;
    }

    @Autowired
    public ConfigurableMessageProvidder(String SpecStr1) {
        this.message = message;
    }
}
