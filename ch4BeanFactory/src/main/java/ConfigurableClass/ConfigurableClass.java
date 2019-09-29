package ConfigurableClass;

import MessageDigestFactory.MessageDigestFactory;
import UseDigistSimple.UseDigist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.MessageDigest;

@Configuration
public class ConfigurableClass {

    @Bean
    public MessageDigestFactory messageDigestFactory(){
        MessageDigestFactory messageDigestFactory = new MessageDigestFactory();
        messageDigestFactory.setTypeDigest("SHA1");
        return messageDigestFactory;
    }

    @Bean
    public MessageDigestFactory defaultMessageProvider(){
        return new MessageDigestFactory();
    }

    @Bean
    public UseDigist useDigist(){
        try {
            UseDigist useDigist = new UseDigist();
            useDigist.setMessageDigest(defaultMessageProvider().getObject());
            useDigist.setMessageDigest1(messageDigestFactory().getObject());
            return useDigist;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
