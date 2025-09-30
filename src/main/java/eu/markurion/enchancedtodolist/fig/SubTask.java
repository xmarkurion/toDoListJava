package eu.markurion.enchancedtodolist.fig;

import java.util.UUID;

public class SubTask {
    String id;
    String name;
    String data;
    Task task;

    public SubTask(String name, String data, Task task) {
        // generate random short uuid
        this.id = Handyman.genUUID();
        this.name = name;
        this.data = data;
    }

}
