package alv.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String... args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MyBean myBean = context.getBean(MyBean.class);
        System.out.println(myBean.getMessage());
    }
}