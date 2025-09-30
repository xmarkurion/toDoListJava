package eu.markurion.enchancedtodolist.fig;

import java.util.Date;
import java.util.UUID;

public class Note {
    String id;
    String data;
    Date date;

    public Note(String id, String data, Date date) {
        this.id = Handyman.genUUID();
        this.data = data;

        // Now date is used.
        this.date = Handyman.nowDate();
    }
}
