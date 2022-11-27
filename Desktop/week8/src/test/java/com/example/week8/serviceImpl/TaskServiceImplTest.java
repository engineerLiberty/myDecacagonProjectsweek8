package com.example.week8.serviceImpl;

import com.example.week8.dto.TaskDto;
import com.example.week8.entity.User;
import com.example.week8.repositories.TaskRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class TaskServiceImplTest {

    @Autowired

    private TaskServiceImpl task;

    @Test
    void createTask() {
        TaskDto dto = new TaskDto();
        dto.setUserId(1L);
        dto.setTitle("Test");
        dto.setTaskDescription("testing the create task method");

        assertEquals("Test", task.createTask(dto).getTitle());

    }

    @Test
    void updateTask() {
        TaskDto update = new TaskDto();
        update.setUserId(1L);
        update.setTaskId(13L);
        update.setTitle("Kings Meal");
        update.setTaskDescription("Serving breakfast");

        assertEquals(13, task.updateTask(update).getTaskId());
    }

    @Test
    void updateTaskToDone() {
        TaskDto moveToDone = new TaskDto();
        moveToDone.setUserId(1L);
        moveToDone.setTaskId(13L);
        assertEquals(13, task.updateTaskToDone(moveToDone).getTaskId());
    }

    @Test
    void updateTaskToPending() {
        TaskDto moveToPending = new TaskDto();
        moveToPending.setUserId(1L);
        moveToPending.setTaskId(13L);
        assertEquals(13, task.updateTaskToPending(moveToPending).getTaskId());
    }

    @Test
    void updateTaskToInProgress() {
        TaskDto moveToInProgress = new TaskDto();
        moveToInProgress.setUserId(1L);
        moveToInProgress.setTaskId(13L);
        assertEquals(13, task.updateTaskToInProgress(moveToInProgress).getTaskId());
    }

    @Test
    void deleteTaskByItId() {
        TaskDto taskDto = new TaskDto();
        taskDto.setUserId(1L);
        taskDto.setTaskId(6L);
        assertEquals(0, task.deleteTaskByItId(taskDto));
    }
}