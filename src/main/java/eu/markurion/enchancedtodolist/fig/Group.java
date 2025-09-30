package eu.markurion.enchancedtodolist.fig;

import java.util.UUID;

public class Group {
    String id;
    String name;
    String details;

    public Group(String name, String details) {
        this.id = Handyman.genUUID();
        this.name = name;
        this.details = details;
    }

    public Group(String name){
        this(name, "");
        this.id = Handyman.genUUID();
    }
}
