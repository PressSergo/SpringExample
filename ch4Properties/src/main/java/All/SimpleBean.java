package All;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service("sim")
@PropertySource("application")
public class SimpleBean {

    @Autowired
    public Environment env;

    @Value("${name}")
    private String name;

    @Value("${gas}")
    private String gas;

    public SimpleBean() {
        name = env.getProperty("name");
        gas = env.getProperty("gas");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SimpleBean{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gas='").append(gas).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
