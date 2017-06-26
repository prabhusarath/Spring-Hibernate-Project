package io.sarath.dependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by SarathKumar on 6/26/2017.
 */
public class Tester {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext content = new AnnotationConfigApplicationContext(Application.class);

        Notifcation hell = content.getBean(Notifcation.class);

        hell. sendNotification("prabhu","sarath kumar");

        content.close();

    }

}
