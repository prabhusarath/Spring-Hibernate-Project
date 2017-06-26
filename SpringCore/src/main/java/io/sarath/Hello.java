package io.sarath;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by SarathKumar on 6/26/2017.
 */

@Component
public class Hello {

    public void Helloworlds(){
        System.out.println("Hello Spring");
    }
}
