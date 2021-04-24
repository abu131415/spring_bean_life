package test;

import ioc.IocBeanLifeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeTest {

    @Test
    public void test(){
        System.out.println("Spring容器初始化===========================");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring容器初始化完毕========================");

        System.out.println("从容器中获取Bean");
        IocBeanLifeService service = context.getBean("iocBeanLifeService", IocBeanLifeService.class);

        System.out.println(service.toString());

        System.out.println("Spring容器准备关闭==========================");
        context.close();
        System.out.println("Spring容器完成关闭===========================");
    }
}
