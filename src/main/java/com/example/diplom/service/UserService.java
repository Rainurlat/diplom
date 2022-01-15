package com.example.diplom.service;

import com.example.diplom.models.UsersModel;
import com.example.diplom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsersModel registerUser(String login, String password){
        if(login !=null && password!=null){
            UsersModel usersModel=new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            return userRepository.save(usersModel);
        } else {
            UsersModel usersModel=new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            return userRepository.save(usersModel);
        }
    }

    public UsersModel authenticate(String login, String password){
        return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
