package io.sarath;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by SarathKumar on 6/26/2017.
 */

@Configuration
public class Application {

    @Bean
    public Hello meths(){
        return new Hello();
    }

}
