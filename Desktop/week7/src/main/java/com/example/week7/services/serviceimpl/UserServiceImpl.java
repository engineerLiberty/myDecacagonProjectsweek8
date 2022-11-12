package com.example.week7.services.serviceimpl;

import com.example.week7.dto.UserSignUpDto;
import com.example.week7.model.User;
import com.example.week7.ripository.UsersRepository;
import com.example.week7.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


//@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private UsersRepository usersRepository;

//    public UserServiceImpl(UsersRepository usersRepository) {
//        this.usersRepository = usersRepository;
//    }

    @Override
    public User userSingUp(UserSignUpDto userSignUpDto) {
        User user = new User();
        user.setFirstName(userSignUpDto.getFirstName());
        user.setLastName(userSignUpDto.getLastName());
        user.setEmail(userSignUpDto.getEmail());
        user.setDob(user.getDob());
        user.setGender(userSignUpDto.getGender());
        return usersRepository.save(user);

    }
}
