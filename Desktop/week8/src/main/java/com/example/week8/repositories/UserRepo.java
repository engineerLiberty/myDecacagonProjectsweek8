package com.example.week8.repositories;

import com.example.week8.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    User findByUserNameAndPassword(String userName,String password);

//    User findByUserName(String userName);
}
