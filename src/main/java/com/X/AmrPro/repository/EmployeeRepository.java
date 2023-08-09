package com.X.AmrPro.repository;

import com.X.AmrPro.buisness.entity.Employee;
import com.X.AmrPro.buisness.mapper.EmployeeMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    List<Employee> findByName(String name, Sort sort);
//nativequery , spesfication ,querydsl

    @Transactional
    @Modifying
    @Query(value = "update Employee e set e.name = ?1, e.age = ?2 where e.name = ?3 and e.age = ?4")
    int updateNameAndAgeByNameAndAge(String name, long age, String name1, long age1);

    //nativeQuery
 /*   @Query(
            value = "SELECT * FROM Employee ORDER BY id",
            countQuery = "SELECT count(*) FROM Employee",
            nativeQuery = true)
    Page<Employee> findAllUsersWithPagination(Pageable pageable);

    //1-named parameter

    @Query("SELECT u FROM Employee u WHERE u.status = :status and u.name = :name")
User findUserByUserStatusAndUserName(@Param("status") Integer userStatus,
  @Param("name") String employeeName);

  // 2-Collection parameter

  @Query(value = "SELECT u FROM Employee u WHERE u.name IN :names")
List<Employee> findEmployeeByNameList(@Param("names") Collection<String> names);

// 3-modifying

@Modifying
@Query(value = "update Employee u set u.status = ? where u.name = ?",
  nativeQuery = true)
int updateEmployeeSetStatusForNameNative(Integer status, String name);

// 4- instert

@Modifying
@Query(
  value =
    "insert into Emplyee (name, age, email, status) values (:name, :age, :email, :status)",
  nativeQuery = true)
void insertEmployee(@Param("name") String name, @Param("age") Integer age,
  @Param("status") Integer status, @Param("email") String email);




  */

    //specification


}

