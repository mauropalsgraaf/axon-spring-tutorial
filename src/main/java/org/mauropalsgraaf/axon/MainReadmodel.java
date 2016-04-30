package org.mauropalsgraaf.axon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainReadmodel {

    public static void main(String[] args) {
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("application.xml");

        ApplicationReadModel application = (ApplicationReadModel) ctx.getBean("applicationReadModel");
        application.run();
    }
}
