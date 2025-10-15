package com.korit.study.ch16.service;

import com.korit.study.ch16.dto.SigninDto;
import com.korit.study.ch16.dto.SignupDto;
import com.korit.study.ch16.entity.User;
import com.korit.study.ch16.repository.UserList;

public class UserService {

    private UserList userList;
    public UserService(UserList userList) {
        this.userList = userList;
    }


    public boolean isDuplicatedUsername(String username){
        return userList.findByUsername(username) != null;

    }

    // 로그인
    public User signin(SigninDto signinDto) {
        User foundUser = userList.findByUsername(signinDto.getUsername());
        if (foundUser == null) {          // 사용자 이름 (아이디) 가 존재하지 않는다.
            return null;
        }
        if (!foundUser.getPassword().equals(signinDto.getPassword())) {  // 사용자 비밀번호가 다르다.
            return null;
        }
        return foundUser;
    }



    //회원가입
    public void signup(SignupDto signupDto) {
        User user = signupDto.toUser();
        user.setId(userList.generateUserID());
        userList.add(user);
    }

    public void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회");
        for(User user : userList.getUsers()) {
            System.out.println(user.toString());
        }
    }
}
