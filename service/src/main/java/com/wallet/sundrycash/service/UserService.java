package com.wallet.sundrycash.service;

import com.wallet.sundrycash.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void registerUser(List<User> user);
    void deRegisterUser(List<User> user);
    Long userCounts();
}
