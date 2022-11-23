package com.example.week8.serviceImpl;

import com.example.week8.dto.TaskDto;
import com.example.week8.entity.Task;
import com.example.week8.entity.User;
import com.example.week8.exception.TaskNotFoundException;
import com.example.week8.repositories.TaskRepo;
import com.example.week8.repositories.UserRepo;
import com.example.week8.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepo taskRepo;
    private final UserRepo userRepo;
    private final HttpSession httpSession;


//    public User findLogInUser(){
//        return userRepo.findById((Long) httpSession.getAttribute("userId")).get();
//    }

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

//       Alternatively i can use a callback to set the user Id by calling logIn() method all defined here in this service class

//       user.setUserId(findLogInUser().getUserId());
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

//    public Task getTaskId(TaskDto taskDto){
//        return taskRepo.findById(taskDto.getTaskId()).orElseThrow(()-> new TaskNotFoundException(taskDto.getTaskId()));
//    }

    public void deleteTaskByItId(TaskDto taskDto){
        User user = new User();
        user.setUserId(taskDto.getUserId());

       taskRepo.deleteById(taskDto.getTaskId());




//        Task task = taskRepo.findById(taskDto.getTaskId())
//                .orElseThrow(()-> new TaskNotFoundException(taskId));
//
//
//         taskRepo.deleteById(task.getTaskId());
    }

}


























////
////    @Override
////    public Task getTaskById(Long taskId) {
////       return taskRepo.findById(taskId).orElse(null);
////    }
////
////    @Override
////    public void setTaskCompleted(Long id) {
////
////    }
////
////    @Override
////    public void setTaskNotCompleted(Long id) {
////
////    }
////
////    @Override
////    public List<Task> findTasksByUser(User user) {
////        return null;
////    }
////
////    @Override
////    public void assignUserToTask(Task task, User user) {
////
////    }
////

////    @Override
////    public List<Task> findAllByOrderByEndDateAsc() {
////        return null;
////    }
////
////    @Override
////    public List<Task> findTasksByUserOrderByEndDateAsc(User user) {
////        return null;
////    }
//}
