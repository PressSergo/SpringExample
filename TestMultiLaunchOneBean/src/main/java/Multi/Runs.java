package Multi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runs {
    public static void main(String[] args){
        try {
            ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/simple.xml");
            SimpleBean simpleBean = classPathXmlApplicationContext.getBean("sim",SimpleBean.class);
            simpleBean.shows();
            Thread.sleep(1000);
            simpleBean.setMessage("This another type ))))");
            simpleBean.shows();
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
