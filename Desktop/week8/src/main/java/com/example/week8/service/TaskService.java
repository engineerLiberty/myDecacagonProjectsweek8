package com.example.week8.service;

import com.example.week8.dto.TaskDto;
import com.example.week8.entity.Task;
import com.example.week8.entity.User;

import java.util.List;

public interface TaskService {


    List<Task> findAll();

    Task createTask(TaskDto task);

//    User findLogInUser();

    Task updateTask(TaskDto taskDto);


   void deleteTaskByItId(TaskDto taskDto);






























//    void updateTask(Long taskId, TaskDto taskDto);
//
//    void deleteTask(Long taskId);
//
//    Task getTaskById(Long taskId);
//
//    void setTaskCompleted(Long id);
//
//    void setTaskNotCompleted(Long id);
//
//    List<Task> findTasksByUser(User user);
//
//    void assignUserToTask(Task task, User user);
//
//    List<Task>  findFreeTasks();
//
//    List<Task> findAllByOrderByEndDateAsc();
//
//    List<Task> findTasksByUserOrderByEndDateAsc(User user);

}
