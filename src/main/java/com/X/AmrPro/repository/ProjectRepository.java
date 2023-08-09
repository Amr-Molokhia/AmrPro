package com.X.AmrPro.repository;

import com.X.AmrPro.buisness.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByProName(String proName);

    @Transactional
    @Modifying
    @Query("update Project p set p.proName = ?1, p.protype = ?2 where p.proName = ?3 and p.protype = ?4")
    int updateProNameAndProtypeByProNameAndProtype(String proName, String protype, String proName1, String protype1);

    @Query("select (count(p) > 0) from Project p where p.proName = ?1")
    boolean existsByProName(String proName);
    
}