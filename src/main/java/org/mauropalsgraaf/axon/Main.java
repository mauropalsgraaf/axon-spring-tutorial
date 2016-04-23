package org.mauropalsgraaf.axon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("application.xml");

        Application application = (Application) ctx.getBean("application");

        application.run();
    }
}
