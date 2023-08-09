package com.X.AmrPro.buisness.mapper;

import com.X.AmrPro.buisness.DTO.EmployeeDTO;
import com.X.AmrPro.buisness.entity.Employee;
import org.mapstruct.*;

import java.time.LocalDate;
//flat map ,nested mapper, inverseinhrtanc ,lifecycle hooks aftermapping , nullcheck stratgy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {

    Employee toEntity(EmployeeDTO employeeDTO);

    EmployeeDTO toDto(Employee employee);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee partialUpdate(EmployeeDTO employeeDTO, @MappingTarget Employee employee);
}



//    @Mapping(source = "orderStatus",target = "status", qualifiedByName ="checkOrderStatus" )
//    @Mapping(source = "empID", target = "empID",ignore = true)
//    @Mapping(source = "registrationDate", target = "registrationDate",dateFormat = "dd/mm/yyyy",defaultExpression = "java(LocalDate.now())")
//    @Mapping(target = "type",constant = "new")
//    @BeforeMapping
//    default void validate(EmployeeDTO employeeDTO){
//        if (employeeDTO.getEmpId()==0){
//            employeeDTO.setEmpId(1);
//        }
//    }




    //    @Mapping(source = "orderStatus",target = "status", qualifiedByName ="checkOrderStatusInString" )
//    @InheritInverseConfiguration


//    @AfterMapping
//    default void calculateSum(Employee employee,@MappingTarget EmployeeDTO employeeDTO){
//        float sum = 0;
//        if(employee.getAge()!=0 && employee.getEmpId()!=0){
//            sum = sum + (employee.getAge()* employee.getEmpId());
//            employeeDTO.setSum(sum);
//        }
//    }


//    cutome mapping

//    @Named("checkOrderStatus")
//    default boolean checkOrderStatus(String orderStatus){
//        boolean flag;
//        if(orderStatus.equals("delevred")){
//            flag = true;
//        }else{
//            flag = false;
//        }
//        return flag;
//    }
//    default String checkOrderStatusInString(boolean status){
//        String orderStatus;
//        if(status){
//            orderStatus = "delevred";
//        }else{
//            orderStatus = "pending";
//        }
//        return orderStatus;
//    }
