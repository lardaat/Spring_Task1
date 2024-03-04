import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHello =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello.getMessage());

        HelloWorld beanHello1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello1.getMessage());

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getMessage());

        System.out.println("HelloWorld equals: " + (beanHello==beanHello1));
        System.out.println("Cat equals: " + (beanCat==beanCat1));

        /*boolean helloWorldEquals = beanHello.equals(beanHello1);
        boolean catEquals = beanCat.equals(beanCat1);
        System.out.println("HelloWorld equals: " + helloWorldEquals);
        System.out.println("Cat equals: " + catEquals);*/

    }
}