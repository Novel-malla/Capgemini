package springcoreq9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springq9.xml");
        context.registerShutdownHook();

        BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("LifeCycle");
        beanLifeCycle.display();
        BeanLifeCycle beanLifeCycle1=(BeanLifeCycle)context.getBean("LifeCycle1");
        beanLifeCycle1.display();
    }
}
