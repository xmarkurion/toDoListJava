package eu.markurion.enchancedtodolist.fig;

import java.sql.Date;
import java.util.ArrayList;

public class Task {
    String name;
    Date startedAt;
    Date deadline;
    Date finishedAt;
    ArrayList<Idea> idea;

    public Task(String name, Date deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public Task(String name, Date startedAt, Date deadline, Date finishedAt) {
        this.name = name;
        this.startedAt = startedAt;
        this.deadline = deadline;
        this.finishedAt = finishedAt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }
    public Date getDeadline() {
        return deadline;
    }
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    public Date getFinishedAt() {
        return finishedAt;
    }
    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

}
