package com.X.AmrPro.buisness.mapper;

import com.X.AmrPro.buisness.DTO.ProjectDTO;
import com.X.AmrPro.buisness.entity.Project;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,uses = EmployeeMapper.class)
public interface ProjectMapper {
    Project toEntity(ProjectDTO projectDTO);

    ProjectDTO toDto(Project project);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Project partialUpdate(ProjectDTO projectDTO, @MappingTarget Project project);
}