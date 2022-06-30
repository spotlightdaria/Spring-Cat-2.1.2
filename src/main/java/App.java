import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat1 = (Cat)  applicationContext.getBean("cat");
        Cat cat2 = (Cat)  applicationContext.getBean("cat");
        boolean compHello = bean == bean1;
        boolean compCat = cat1 == cat2;
        System.out.println(compHello);
        System.out.println(compCat);
    }
}