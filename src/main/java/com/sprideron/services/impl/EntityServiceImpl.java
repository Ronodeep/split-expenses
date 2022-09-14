package com.sprideron.services.impl;

import com.sprideron.models.Users;
import com.sprideron.repository.SpringJPAUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EntityServiceImpl implements EntityService{
    @Autowired
    private SpringJPAUserRepository springJPAUserRepository;

    @Override
    public Users saveUser(Users user) {
        return springJPAUserRepository.save(user);
    }

    @Override
    public List<Users> getUsers() {
        return springJPAUserRepository.findAll();
    }
}
