package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class TaskMapperTestSuite {
    @InjectMocks
    TaskMapper taskMapper;

    @Test
    public void mapToTaskDtoTest() {
        //Given
        Task task = new Task(1L, "title", "content");
        //When
        TaskDto taskDtoResult = taskMapper.mapToTaskDto(task);
        //Then
        assertThat("title").isEqualTo(taskDtoResult.getTitle());
    }

    @Test
    public void mapToTaskTest() {
        //Given
        TaskDto taskDto = new TaskDto(1L, "title", "content");
        //When
        Task taskResult = taskMapper.mapToTasks(taskDto);
        //Then
        assertThat("title").isEqualTo(taskResult.getTitle());
    }

    @Test
    public void mapToTaskDtoList() {
        //Given
        Task task1 = new Task(1L, "title1", "content1");
        Task task2 = new Task(2L, "title2", "content2");
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        //When
        List<TaskDto> tasksDtoResult = taskMapper.mapToTaskDtoList(tasks);
        //Then
        assertThat(2).isEqualTo(tasksDtoResult.size());
        assertThat(2L).isEqualTo(tasksDtoResult.get(1).getId());
    }
}