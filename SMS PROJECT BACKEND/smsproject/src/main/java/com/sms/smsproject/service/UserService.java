package com.sms.smsproject.service;

import com.sms.smsproject.dto.UserDTO;
import com.sms.smsproject.entity.User;
import com.sms.smsproject.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUser(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }

    public UserDTO getUserByUserId(String userID){
       User user=userRepo.getUserById(userID);
       return modelMapper.map(user,UserDTO.class);
    }
    public UserDTO getUserByUserIdAndAddress(String userID,String address){
        User user=userRepo.getUserByIdAndAddress(userID,address);
        return modelMapper.map(user,UserDTO.class);
    }


}
