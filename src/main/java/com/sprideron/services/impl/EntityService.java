package com.sprideron.services.impl;

import com.sprideron.models.Users;

import java.util.List;

public interface EntityService {
    Users saveUser(Users user);
    List<Users> getUsers();
}
