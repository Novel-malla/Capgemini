package springcoreq8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements InitializingBean,DisposableBean  {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(getName()+" is eating.");
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    // Called using init-method and destroy-method
    public void myInit(){
        System.out.println("Init-method");
    }

    public  void  myDest(){
        System.out.println("Destroy-method");
    }

    
    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public  void  preDestroy(){
        System.out.println("PreDestroy");
    }
}
