package com.X.AmrPro.buisness.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Task")
@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@Column(name = "idtask", nullable = false)
    //private Long idtask;
    @Column(name = "taskName", nullable = false)
    private String taskName;
//same many to many
    @ToString.Exclude
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "task_projects",
            joinColumns = @JoinColumn(name = "task_idtask"),
            inverseJoinColumns = @JoinColumn(name = "projects_projectid"))
    private Set<Project> projects = new LinkedHashSet<>();

}
