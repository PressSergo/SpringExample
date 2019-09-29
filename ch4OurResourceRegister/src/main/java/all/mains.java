package all;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mains {
    public static void main(String[] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("appl.xml");
        User user = classPathXmlApplicationContext.getBean("tes",User.class);
        System.out.println(user);
    }
}
