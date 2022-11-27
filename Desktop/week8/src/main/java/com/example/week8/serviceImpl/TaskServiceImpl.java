package com.example.week8.serviceImpl;

import com.example.week8.dto.TaskDto;
import com.example.week8.entity.Task;
import com.example.week8.entity.User;
import com.example.week8.enums.Status;
import com.example.week8.repositories.TaskRepo;
import com.example.week8.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepo taskRepo;


    @Override
    public Task createTask(TaskDto taskDto) {
        Task task = new Task();
        User user = new User();
        user.setUserId(taskDto.getUserId());
        if (user.equals(null)){
            return null;
        }
        BeanUtils.copyProperties(taskDto,task);
        task.setUser(user);
         return taskRepo.save(task);
    }


    @Override
    public Task updateTask(TaskDto taskDto) {
        User user = new User();
        user.setUserId(taskDto.getUserId());
        Task task = taskRepo.findById(taskDto.getTaskId()).orElse(null);
        if (task==null){
            return null;
        }
        BeanUtils.copyProperties(taskDto, task);
        task.setUser(user);
        return taskRepo.save(task);
    }


    public Task updateTaskToDone(TaskDto taskDto){
        User user = new User();
        user.setUserId(taskDto.getUserId());
        Task task = taskRepo.findById(taskDto.getTaskId()).orElse(null);
        task.setStatus(Status.Done);
        task.setCompletedDate(LocalDate.now());
        task.setComplete(isComplete());
        return taskRepo.save(task);
    }

    public Task updateTaskToPending(TaskDto taskDto){
        User user = new User();
        user.setUserId(taskDto.getUserId());
        Task task = taskRepo.findById(taskDto.getTaskId()).orElse(null);
        task.setComplete(isNotComplete());
        task.setStatus(Status.Pending);
        task.setLastUpdated(LocalDate.now());
        return taskRepo.save(task);
    }

    public Task updateTaskToInProgress(TaskDto taskDto){
        User user = new User();
        user.setUserId(taskDto.getUserId());
        Task task = taskRepo.findById(taskDto.getTaskId()).orElse(null);
        task.setStatus(Status.InProgress);
        task.setComplete(isNotComplete());
        task.setLastUpdated(LocalDate.now());
        return taskRepo.save(task);
    }


    public boolean isComplete(){
        return true;
    }

    public boolean isNotComplete(){return false;}



    @Override
    public List<Task> findAll() {

        return taskRepo.findAll();
    }


    public void deleteTaskByItId(TaskDto taskDto){
        User user = new User();
        user.setUserId(taskDto.getUserId());

       taskRepo.deleteById(taskDto.getTaskId());
    }

}