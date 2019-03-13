package pl.maciej.ToDoList.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private List<TaskEntity> list = new ArrayList<>();

    public void addTask(TaskForm task){
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setDeadline(task.getDeadline());
        taskEntity.setMessage(task.getMessage());

        list.add(taskEntity);
    }

    public List<TaskEntity> getAllContacts() {
        return list;
    }
}
