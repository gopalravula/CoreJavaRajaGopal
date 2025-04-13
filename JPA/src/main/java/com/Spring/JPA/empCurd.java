package com.Spring.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empCurd extends JpaRepository<EmployeEntity, Integer>
{

}
