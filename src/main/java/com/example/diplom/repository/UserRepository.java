package com.example.diplom.repository;

import com.example.diplom.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UsersModel, Integer>{

    Optional<UsersModel> findByLoginAndPassword(String login, String password );
}
