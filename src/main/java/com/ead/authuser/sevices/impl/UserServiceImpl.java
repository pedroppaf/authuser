package com.ead.authuser.sevices.impl;

import com.ead.authuser.repositories.UserRepository;
import com.ead.authuser.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
}
