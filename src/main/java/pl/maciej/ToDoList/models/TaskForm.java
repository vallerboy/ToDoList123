package pl.maciej.ToDoList.models;

import java.time.LocalTime;
import java.util.Objects;


//For each form html
public class TaskForm {
    private String message;
    private LocalTime deadline;

    public LocalTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalTime deadline) {
        this.deadline = deadline;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskForm taskForm = (TaskForm) o;
        return Objects.equals(message, taskForm.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
