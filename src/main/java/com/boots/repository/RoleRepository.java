package com.boots.repository;


import com.boots.entity.Role;
import com.boots.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
