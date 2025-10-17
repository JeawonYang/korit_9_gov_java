package com.korit.study.ch22.service;

import com.korit.study.ch22.Dto.SigninDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import java.util.Objects;

public class SigninServiceImpl implements SigninService{
    // 싱글톤으로 만들것

    private UserRepository userRepository;

    public SigninServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }
    @Override
    public void signin(SigninDto signinDto) {
        User user;
        while (true) {
            user = userRepository.getInstance() (signinDto.getUsername());
            if (Objects.isNull(signinDto.getUsername())) {
                System.out.println("사용자 정보를 다시 확인하세요.");
                return;
            }
            break;
        }
            user = SignupService.isValidPassword(signinDto.getPassword());
        while (true) {
            if (Objects.isNull(signinDto.getPassword())) {
                System.out.println("사용자 정보를 다시 확인하세요.");
                return;
            }
            break;
        }
        System.out.println("로그인 성공 !! " + user.getUsername());

        // 로그인을 시도한 사용자 이름 확인 UserRepository에서
        // 해당 사용자 이름을 가진 User 객체가 있는지 확인
        // 객체가 null 이면 함수 탈출 (사용자 정보를 다시 확인하세요.)

        // 비밀번호 일치확인
        // 비밀번호가 일치하지 않으면 함수 탈출 (사용자 정보를 다시 확인하세요.)

        //로그인 성공 -> 로그인 성공한 User객체 toString으로 출력
    }

    @Override
    public boolean isEmpty(String str) {
        return !Objects.isNull(str) && !str.isBlank();
        //username, password가 각각 곰백이 아닌지 확인용도

    }
}
