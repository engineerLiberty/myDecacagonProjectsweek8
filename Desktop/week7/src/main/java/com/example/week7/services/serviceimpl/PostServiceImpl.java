package com.example.week7.services.serviceimpl;

import com.example.week7.dto.PostRequestDto;
import com.example.week7.model.Post;
import com.example.week7.model.User;
import com.example.week7.ripository.PostRepository;
import com.example.week7.ripository.UsersRepository;
import com.example.week7.services.PostService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private final UsersRepository usersRepository;
    private final PostRepository postRepository;


    public PostServiceImpl(UsersRepository usersRepository, PostRepository postRepository) {
        this.usersRepository = usersRepository;
        this.postRepository = postRepository;
    }

    @Override
    public String creatPost(PostRequestDto postRequestDto, Long userId) {

        User user = usersRepository.findById(userId).get();
        Post post = new Post();
        BeanUtils.copyProperties(postRequestDto,post);
        post.setUser(user);
        postRepository.save(post);

        return "your post was successful";
    }

    @Override
    public String fetchUserAllPost(Long userId) {
        return null;
    }
}
