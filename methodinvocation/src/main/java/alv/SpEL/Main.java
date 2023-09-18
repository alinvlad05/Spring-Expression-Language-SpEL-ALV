package alv.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Show show1 = (Show) context.getBean("show1");
        show1.present();
        Show show2 = (Show) context.getBean("show2");
        show2.present();
    }
}