package com.X.AmrPro.buisness.DTO;

import lombok.Data;

import java.util.List;

@Data

public class ProjectDTO {
   // private long proId;

    private String proName;

    private String protype;
    private List<EmployeeDTO> employeeDTOList ;
}
