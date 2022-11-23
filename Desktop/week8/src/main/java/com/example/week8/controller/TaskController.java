package com.example.week8.controller;

import com.example.week8.dto.TaskDto;
import com.example.week8.entity.Task;
import com.example.week8.entity.User;
import com.example.week8.repositories.UserRepo;
import com.example.week8.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/task")
@RequiredArgsConstructor
@RestController

public class TaskController {

    private final TaskService taskService;

    @GetMapping("/list")
    public ResponseEntity<String>listOfTask(TaskDto taskDto){
        taskService.findAll();
       return new  ResponseEntity<>("list printed successfully", HttpStatus.ACCEPTED);
    }

    @PostMapping("/addTask")
    public ResponseEntity<String>createTask(@RequestBody TaskDto taskDto){
       Task task = taskService.createTask(taskDto);
       if (task.equals(null)){
           return new ResponseEntity<>("Could not creat a task, possible reason could be an invalid task ID",
                   HttpStatus.BAD_GATEWAY);
       }

        return new ResponseEntity<>("Task created successfully",HttpStatus.CREATED);
    }

    @PostMapping("/updateTask")
    public ResponseEntity<String>updateTask(@RequestBody TaskDto taskDto){
        Task task = taskService.updateTask(taskDto);
        if (task==null){
            return new ResponseEntity<>("Fail to update task",HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>("Your task was updated successfully",HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteTask")
    public ResponseEntity<String>deleteOneTask(@RequestBody TaskDto taskDto){
        taskService.deleteTaskByItId(taskDto);
        return new ResponseEntity<>("Task deleted successfully",HttpStatus.ACCEPTED);
    }
}
