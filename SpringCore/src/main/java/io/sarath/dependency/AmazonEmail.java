package io.sarath.dependency;

import org.springframework.stereotype.Component;

/**
 * Created by SarathKumar on 6/26/2017.
 */

@Component
public class AmazonEmail implements Services {

    public void sendEmail(String to, String from) {
        System.out.print("-- Using Amaxon Services --");
        System.out.print("to"+ to);
        System.out.print(" from "+  from);


    }
}
