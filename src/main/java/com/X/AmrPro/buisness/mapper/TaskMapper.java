package com.X.AmrPro.buisness.mapper;

import com.X.AmrPro.buisness.DTO.TaskDTO;
import com.X.AmrPro.buisness.entity.Task;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TaskMapper {
    Task toEntity(TaskDTO taskDTO);

    TaskDTO toDto(Task task);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Task partialUpdate(TaskDTO taskDTO, @MappingTarget Task task);
}