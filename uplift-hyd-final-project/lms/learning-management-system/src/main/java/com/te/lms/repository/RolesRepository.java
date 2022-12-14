package com.te.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, String>{

}
