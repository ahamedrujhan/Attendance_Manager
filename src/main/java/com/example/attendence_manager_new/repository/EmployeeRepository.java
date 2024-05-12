package com.example.attendence_manager_new.repository;

import com.example.attendence_manager_new.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Query Builder Mechanism
    Optional<Employee> findEmployeeByEmail(String email);
    List<Employee> findEmployeeByFirstNameEqualsAndLastNameEquals(String firstName, String lastName);
    List<Employee> findEmployeeByFirstName(String firstName);

    //JPQL Query
@Query("SELECT e FROM Employee e WHERE e.id = ?1")
    Optional<Employee> findEmployeeById(Long id);

    //Native Query
    @Query(value = "SELECT * FROM Employee", nativeQuery = true)
    List<Employee> listAllEmployees();

    //Query With Named Parameters

    //Select Employee by Status
    @Query("SELECT e FROM Employee e WHERE e.status = :status")
    List<Employee> filterEmployeeByStatus(@Param("status") int status);

    //Delete Employee by id

    @Transactional
    @Modifying
    @Query("DELETE FROM Employee e WHERE e.id = ?1")
    int deleteEmployeeById(Long id);


}
