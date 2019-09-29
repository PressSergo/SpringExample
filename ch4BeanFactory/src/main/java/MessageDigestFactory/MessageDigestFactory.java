package MessageDigestFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

public class MessageDigestFactory implements FactoryBean<MessageDigest>, InitializingBean {
    private String typeDigest = "MD5";
    private MessageDigest messageDigest;

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }

    @Override
    public Class<MessageDigest> getObjectType() {
        return MessageDigest.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        messageDigest = MessageDigest.getInstance(typeDigest);
    }

    public void setTypeDigest(String typeDigest) {
        this.typeDigest = typeDigest;
    }
}
