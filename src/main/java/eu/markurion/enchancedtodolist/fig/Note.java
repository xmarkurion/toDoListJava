package eu.markurion.enchancedtodolist.fig;
import java.util.Date;

/**
 * Note class represents a note with an ID, data, and date.
 */
public class Note {
    // Contrast this() and this. - example of constructor chaining

    /** Unique identifier for the note */
    String id;

    /** data : Content of the note */
    String data;

    /** Date when the note was created or last modified */
    Date date;

    // Note can accept data, and by constructor chaining

    /**
     * Constructor that initializes a Note with data, generating a unique ID and setting the current date.
     * @param data Content of the note
     */
    public Note(String data) {
        // it will call the main constructor with id and current date
        this(Handyman.genUUID(), data, Handyman.nowDate());
    }

    // Note can accept data and date, and by constructor chaining

    /**
     * Constructor that initializes a Note with data and a specific date, generating a unique ID.
     * @param data Content of the note
     * @param date Date when the note was created or last modified
     */
    public Note(String data, Date date){
        this(Handyman.genUUID(), data, date);
    }

    /**
     * Main constructor that initializes a Note with a specific ID, data, and date.
     * @param id Unique identifier for the note
     * @param data Content of the note
     * @param date Date when the note was created or last modified
     */
    public Note(String id, String data, Date date) {
        this.id = id;
        this.data = data;
        this.date = date;
    }
}
