package com.X.AmrPro.buisness.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Project")
@ToString
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // @Column(name = "projectid", nullable = false)
    // private Long projectid;

    @Column(name = "proName", nullable = false)
    private String proName;
    @Column(name = "protype", nullable = false)
    private String protype;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_emp_id")
    private Employee employee;
//many to many problems = lazy loading
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "projects")
    private Set<Task> tasks = new LinkedHashSet<>();

}
