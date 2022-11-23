package com.example.week8.serviceImpl;

import com.example.week8.dto.LogInDto;
import com.example.week8.dto.SignUpDto;
import com.example.week8.dto.UserDto;
import com.example.week8.entity.User;
import com.example.week8.repositories.UserRepo;
import com.example.week8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;


    @Override
    public User signUp(SignUpDto signUpDto) {
        User user = new User();
        BeanUtils.copyProperties(signUpDto, user);
        System.out.println(user);
        return userRepo.save(user);
    }

    @Override
    public User logIn(LogInDto logInDto) {
        UserDto userDto = new UserDto();
        User user = userRepo.findByUserNameAndPassword(logInDto.getUserName(), logInDto.getPassword());
        if (user == null) {
            throw new RuntimeException();
        }
        BeanUtils.copyProperties(userDto, logInDto);
        return user;
    }


    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }

}
