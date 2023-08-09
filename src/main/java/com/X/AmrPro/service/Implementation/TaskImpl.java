package com.X.AmrPro.service.Implementation;

import com.X.AmrPro.buisness.DTO.TaskDTO;
import com.X.AmrPro.repository.EmployeeRepository;
import com.X.AmrPro.repository.TaskRepository;
import com.X.AmrPro.service.Interface.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskImpl implements Task {

   private final TaskRepository taskRepository;
   private final EmployeeRepository employeeRepository;
@Autowired
    public TaskImpl(TaskRepository taskRepository, EmployeeRepository employeeRepository) {
        this.taskRepository = taskRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Task addTask(TaskDTO taskDTO) {
        return null;
    }

    @Override
    public List<Task> getTask() {
        return null;
    }

    @Override
    public Task getTask(long Id) {
        return null;
    }

    @Override
    public Task deleteTask(long Id) {
        return null;
    }

    @Override
    public Task updateTask(long Id, TaskDTO taskDTO) {
        return null;
    }

    @Override
    public Task addTaskToProject(long Id, TaskDTO taskDTO) {
        return null;
    }

    @Override
    public Task removeTaskFromProject(long Id, TaskDTO taskDTO) {
        return null;
    }
}
