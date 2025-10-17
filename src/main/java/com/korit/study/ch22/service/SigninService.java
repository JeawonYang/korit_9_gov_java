package com.korit.study.ch22.service;

import com.korit.study.ch22.Dto.SigninDto;

public interface SigninService {
    void signin(SigninDto signinDto);
    boolean isEmpty(String str); // 공백을 포함하면 안됨, Isblank 사용해서 검사
}
