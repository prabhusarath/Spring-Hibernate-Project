package io.sarath.dependency;

import org.springframework.stereotype.Component;

/**
 * Created by SarathKumar on 6/26/2017.
 */

@Component
public class Notifcation {

    public Services serv;

    public Notifcation(Services served){
        this.serv = served;
    }

    public void sendNotification(String to,String from){
        serv.sendEmail(to,from);
    }
}
