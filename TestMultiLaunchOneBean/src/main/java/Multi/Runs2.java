package Multi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runs2 {
    public static void main(String[] args){
        try {
            Thread.sleep(1000);
            ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/simple.xml");
            SimpleBean simpleBean = classPathXmlApplicationContext.getBean("sim",SimpleBean.class);
            simpleBean.shows();
            Thread.sleep(5000);
            simpleBean.shows();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
