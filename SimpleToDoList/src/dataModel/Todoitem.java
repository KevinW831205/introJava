package dataModel;

import java.time.LocalDate;

public class Todoitem {

    private String description;
    private String details;
    private LocalDate deadline;

    public Todoitem(String description, String details, LocalDate deadline) {
        this.description = description;
        this.details = details;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
