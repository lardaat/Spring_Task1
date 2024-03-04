import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHello =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello.getMessage());

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getMessage());

        boolean helloWorldEquals = bean.equals(beanHello);
        boolean catEquals = beanCat.equals(beanCat1);


        System.out.println("HelloWorld equals: " + helloWorldEquals);
        System.out.println("Cat equals: " + catEquals);

    }
}