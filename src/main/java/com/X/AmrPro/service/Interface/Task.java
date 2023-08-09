package com.X.AmrPro.service.Interface;

import com.X.AmrPro.buisness.DTO.EmployeeDTO;
import com.X.AmrPro.buisness.DTO.TaskDTO;
import com.X.AmrPro.buisness.entity.Employee;

import java.util.List;

public interface Task {
    public Task addTask(TaskDTO taskDTO);
    public List<Task> getTask();
    public Task getTask(long Id);

    public Task deleteTask(long Id);

    public Task updateTask(long Id, TaskDTO taskDTO);

    public Task addTaskToProject(long Id, TaskDTO taskDTO);

    public Task removeTaskFromProject(long Id, TaskDTO taskDTO);
}
