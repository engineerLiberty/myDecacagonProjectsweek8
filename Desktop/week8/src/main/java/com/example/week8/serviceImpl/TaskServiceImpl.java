package com.example.week8.serviceImpl;

import com.example.week8.dto.TaskDto;
import com.example.week8.entity.Task;
import com.example.week8.entity.User;
import com.example.week8.repositories.TaskRepo;
import com.example.week8.repositories.UserRepo;
import com.example.week8.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepo taskRepo;

    @Override
    public List<Task> findAll() {

        return taskRepo.findAll();
    }


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


    public Task updateStatus(TaskDto taskDto) {
        User user = new User();
        user.setUserId(taskDto.getUserId());
        Task task = taskRepo.findById(taskDto.getTaskId()).orElse(null);
        if (task.equals(null)) {
            return null;
        }

        task.setStatus(taskDto.getStatus());

        if (task.getStatus().equalsIgnoreCase("Done")) {
            task.setCompletedDate(LocalDate.now());
            task.setComplete(isComplete());
        }else {
            task.setCompletedDate(null);
        }
        task.setUser(user);
        return taskRepo.save(task);
    }

    public boolean isComplete(){
        return true;
    }


    public void deleteTaskByItId(TaskDto taskDto){
        User user = new User();
        user.setUserId(taskDto.getUserId());

       taskRepo.deleteById(taskDto.getTaskId());
    }

}
