package com.X.AmrPro.buisness.DTO;

import jakarta.annotation.Nullable;
import lombok.Data;

@Data
public class EmployeeDTO {
    @Nullable
//    private long EmpId;
    private String name;
    private long age;

//    private long sum;
}
