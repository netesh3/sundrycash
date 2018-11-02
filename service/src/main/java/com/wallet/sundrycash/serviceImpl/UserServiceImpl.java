package com.wallet.sundrycash.serviceImpl;

import com.wallet.sundrycash.domain.User;
import com.wallet.sundrycash.repository.UserRepository;
import com.wallet.sundrycash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void registerUser(List<User> user) {
        userRepository.saveAll(user);
    }

    @Override
    public void deRegisterUser(List<User> user) {
        userRepository.delete((User) user);
    }

    @Override
    public Long userCounts() {
        return userRepository.count();
    }
}
