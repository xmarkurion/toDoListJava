package eu.markurion.enchancedtodolist.fig;

public class Idea {
    String id;
    String name;
    String details;

    public Idea(String name) {
        this(name, "");
        this.id = Handyman.genUUID();
    }

    public Idea(String name, String details) {
        this.id = Handyman.genUUID();
        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
