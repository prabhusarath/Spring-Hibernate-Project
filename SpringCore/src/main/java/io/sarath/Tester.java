package io.sarath;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by SarathKumar on 6/26/2017.
 */
public class Tester {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext content = new AnnotationConfigApplicationContext(Application.class);

        Hello hell = content.getBean(Hello.class);

        hell.Helloworlds();

        content.close();

    }

}
