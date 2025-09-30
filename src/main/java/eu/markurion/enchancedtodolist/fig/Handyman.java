package eu.markurion.enchancedtodolist.fig;

import java.util.Date;

public class Handyman {
    public static String genUUID() {
        return java.util.UUID.randomUUID().toString();
    }

    public static Date nowDate(){
        return Date.from(java.time.Instant.now());
    }
}
