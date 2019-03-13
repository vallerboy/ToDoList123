package pl.maciej.ToDoList.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.maciej.ToDoList.models.ToDoService;

@Controller
public class MainController {


    @Autowired
    ToDoService toDoService;


    @GetMapping("/toDo")
    public String toDo(){
        return "toDo";
    }

    @PostMapping("/toDo")
    public String addTask(@RequestParam("name") String name, Model model){

    toDoService.addTask(name);

    model.addAttribute("getList", toDoService.getAllContacts());

    return "toDo";
    }



}
