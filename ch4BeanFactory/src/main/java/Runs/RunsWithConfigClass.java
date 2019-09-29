package Runs;

import ConfigurableClass.ConfigurableClass;
import UseDigistSimple.UseDigist;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunsWithConfigClass {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigurableClass.class);
        UseDigist useDigist = annotationConfigApplicationContext.getBean("useDigist",UseDigist.class);
        useDigist.GetIt("Hamurapy or not hamurapy )))");
    }
}
