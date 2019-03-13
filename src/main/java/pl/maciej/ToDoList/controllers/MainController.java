package pl.maciej.ToDoList.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.maciej.ToDoList.models.TaskForm;
import pl.maciej.ToDoList.models.ToDoService;

@Controller
public class MainController {
    @Autowired
    ToDoService toDoService;


    @GetMapping("/toDo")
    public String toDo(Model model){
        TaskForm taskForm = new TaskForm();
       // taskForm.setMessage("ale kurde jaja (kinematyka odrwotna kury)");

        model.addAttribute("taskForm", taskForm);
        return "toDo";
    }

    @PostMapping("/toDo")
    public String addTask(@ModelAttribute("taskForm") TaskForm taskForm,
                          Model model){

         toDoService.addTask(taskForm);
         model.addAttribute("getList", toDoService.getAllContacts());

         return "toDo";
    }




}
