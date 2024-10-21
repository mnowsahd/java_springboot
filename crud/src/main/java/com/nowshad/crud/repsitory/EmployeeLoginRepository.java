package com.nowshad.crud.repsitory;

import com.nowshad.crud.enity.EmployeeLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeLoginRepository extends JpaRepository<EmployeeLogin, Long> {
}
