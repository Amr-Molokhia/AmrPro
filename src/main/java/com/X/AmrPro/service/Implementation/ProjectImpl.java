package com.X.AmrPro.service.Implementation;

import com.X.AmrPro.buisness.DTO.ProjectDTO;
import com.X.AmrPro.buisness.entity.Employee;
import com.X.AmrPro.repository.ProjectRepository;
import com.X.AmrPro.repository.TaskRepository;
import com.X.AmrPro.service.Interface.EmployeeService;
import com.X.AmrPro.service.Interface.Project;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/*

@Service
public class ProjectImpl implements Project {
    private final ProjectRepository projectRepository;
    private final EmployeeService employeeService;

    private final TaskRepository taskRepository;
@Autowired
    public ProjectImpl(ProjectRepository projectRepository, EmployeeService employeeService, TaskRepository taskRepository) {
        this.projectRepository = projectRepository;
        this.employeeService = employeeService;
        this.taskRepository = taskRepository;
    }

    @Transactional
    @Override
    public Project addProject(ProjectDTO projectDTO) {
        Project project = new Project();
        project.setName(projectDTO.getProName());
        if(projectDTO.getProId()==null){
            return projectRepository.save(project);
        }
    Employee employee = employeeService.getEmployee(projectDTO.getProId());
        project.setProject(project);
        return projectRepository.save(project);

    }
    @Override
    public List<Project> getProject() {
        StreamSupport
                .stream(projectRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    @Override
    public Project getProject(long Id) {
        projectRepository.findById(Id).orElseThrow(()->
        {throw new IllegalArgumentException("employee not found");});
    }

    @Override
    public Project deleteProject(long Id) {
         Project project = getProject(Id);
        projectRepository.delete(project);
        return project;
    }
@Transactional
    @Override
    public Project updateProject(long Id, ProjectDTO projectDTO) {
        Project projectEdit = getProject(Id);
        projectEdit.setProName(projectDTO.getProName());
        if(projectDTO.getProId()==null){
            return projectEdit;
        }
        Employee employee = employeeService.getEmployee(projectDTO.getProId());
        projectEdit.setEmployee(employee);
        return projectEdit;
}

@Transactional

    @Override
    public Project addProjectToEmployee(long proId, long empId) {
        Project project = getProject(proId);
        Employee employee = employeeService.getEmployee(empId);
        if(Objects.nonNull(project.getProject())){
            throw new IllegalArgumentException("employee already has a project");
        }
    employee.setProjects();
        return project;

    }
@Transactional
    @Override
    public Project removeProjectFromEmployee(long proId, long empId) {
       Project project = getProject(proId);
        if(Objects.nonNull(project.getProject())){
            throw new IllegalArgumentException("employee  has no project");
        }
        project.removeProjectFromEmployee(proId, empId);
        return project;

    }
}

 */