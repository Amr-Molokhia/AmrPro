package com.X.AmrPro.buisness.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee")
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

  //  @Column(name = "EmpId", nullable = false)
  //  private long EmpId;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private long age;

    // @Column(name = "id", nullable = false)
    // private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_emp_id")
    private Employee employee;

    @ToString.Exclude
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects = new ArrayList<>();

}
