package com.X.AmrPro.service.Interface;

import com.X.AmrPro.buisness.DTO.EmployeeDTO;
import com.X.AmrPro.buisness.DTO.ProjectDTO;
import com.X.AmrPro.buisness.entity.Employee;

import java.util.List;

public interface Project {
    public Project addProject(ProjectDTO projectDTO);
    public List<Project> getProject();
    public Project getProject(long Id);

    public Project deleteProject(long Id);

    public Project updateProject(long Id, ProjectDTO projectDTO);

    public Project addProjectToEmployee(long proId,long empId);

    public Project removeProjectFromEmployee(long proId,long empId);
}
