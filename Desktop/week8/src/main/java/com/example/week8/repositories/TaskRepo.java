package com.example.week8.repositories;

import com.example.week8.entity.Task;
import com.example.week8.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepo extends JpaRepository<Task,Long> {

//    List<Task> findTaskByTaskId(Task task);
}
