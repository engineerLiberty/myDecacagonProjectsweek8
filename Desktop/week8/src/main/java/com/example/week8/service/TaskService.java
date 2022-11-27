package com.example.week8.service;

import com.example.week8.dto.TaskDto;
import com.example.week8.entity.Task;

import java.util.List;

public interface TaskService {


    List<Task> findAll();

    Task updateTask(TaskDto taskDto);

    Task createTask(TaskDto taskDto);

   short deleteTaskByItId(TaskDto taskDto);

    Task updateTaskToInProgress(TaskDto taskDto);

    Task updateTaskToPending(TaskDto taskDto);

    Task updateTaskToDone(TaskDto taskDto);






























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
