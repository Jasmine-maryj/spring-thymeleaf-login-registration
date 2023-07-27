package com.dev.springthymeleafsecurity.service;

import com.dev.springthymeleafsecurity.dto.UserDto;
import com.dev.springthymeleafsecurity.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserDto userDto);
}
