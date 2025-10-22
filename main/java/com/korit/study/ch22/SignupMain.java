package com.korit.study.ch22;

import com.korit.study.ch22.Dto.SigninDto;
import com.korit.study.ch22.Dto.SignupDto;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.service.SigninServiceImpl;
import com.korit.study.ch22.service.SignupService;

import java.util.Scanner;

public class SignupMain {
    public static void main(String[] args) {
        SignupService signupService = SignupService.getInstance(); //signupService class 에서 싱글톤 인스턴스 가져오기
        SigninServiceImpl signinService = SigninServiceImpl.getInstance();
        Scanner sc = new Scanner(System.in);

        while (true) {   //무한루프 돌리면서 메뉴 선택을 해줌
            System.out.println("[회원가입, 로그인]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.print("선택 >>");

            String selectedMenu = sc.nextLine();         // 다음줄에 사용자에게 입력 받을거임

            if("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료 중 . . . ");   // 대소문자 구별없이 q를 누르면 프로그램 종료
                break;              // 무한루프 종료

            } else if ("1".equals(selectedMenu)) {     // 1번을 누르면
                System.out.println("[ 회원가입 ]");
                SignupDto signupDto = new SignupDto();     //회원가입 정보 추가할 dto 객체 생성
                while (true) {   //무한루프
                    System.out.print("사용자 이름 : ");
                    signupDto.setUsername(sc.nextLine()); //입력받은 이름 dto에 저장
                    if(signupService.isValidDuplicatedUsername(signupDto.getUsername())) {  // 입력받을 이름 중복 확인 getusername을 가져와서 중복 확인)
                     break; // 무한루프 종료
                    }
                    System.out.println("이미 사용중인 사용자의 이름입니다.");
                }

                while (true) {   //무한루프
                    System.out.print("비밀번호 : ");
                    signupDto.setPassword(sc.nextLine());  // 패스워드 입력받은거 dto에 저장
                    if (signupService.isValidPassword(signupDto.getPassword())) {  //pw가 공백인지 아닌지 확인 (signupservice에 있는 저 길쭉한 영어에 isnull문 확인해서 공백인지 아닌지)
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
                }
                while (true) {
                    System.out.print("비밀번호 확인 : ");
                    signupDto.setComfirmPassword(sc.nextLine());  // 또 똑같은거 비밀번호 입력받은거 저장해서
                    if(signupService.isValidConfirmPassword(signupDto.getPassword(),signupDto.getComfirmPassword())) {
                        //getpassword에서 사용자가 입력한 pw 반환후 사용자가 입력한 getComfirmPassword에서 반환후 비교
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");  //일치하지않으면 다시 입력 ㄱㄱ+
                }
                signupService.signup(signupDto);  //signupDto 서비스 호출하여 dto에 저장
                System.out.println(" << 회원가입 완료 >> ");

            } else if ("2".equals(selectedMenu)) {  //2번을 누르면
                System.out.println("[ 로그인 ]");
                // SigninDto 를 생성하여 로그인 정보 입력받음 (공백 확인)
                // 유효성 검사 완료 후 Signin()호출
                // 사용자가 공백이 아닌 유효한 값을 입력해야만 루프를 빠져나와 (break)
                // 실제 로그인 조직을 실행할수 있게 분기처리

                SigninDto signinDto = new SigninDto();
                while (true) {
                    System.out.print("사용자 이름 : ");
                    signinDto.setUsername(sc.nextLine());
                    //비어있지 않을 때 break
                    if (!signinService.isEmpty(signinDto.getUsername())) {
                        break;
                    }
                    System.out.println("사용자 이름을 입력하세요");
                }
                while (true) {
                    System.out.print("비밀번호 : ");
                    signinDto.setPassword(sc.nextLine());
                    if (!signinService.isEmpty(signinDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호를 입력하세요.");
                }
                signinService.signin(signinDto);

            } else if ("3".equals(selectedMenu)) {  //3번을 누르면
                System.out.println("[ 가입된 회원 전체 조회 ]");
                System.out.println(UserRepository.getInstance().toString());  // UserRepository 싱글톤 인스턴스의 toString() 메서드 출력
            }
        }
        System.out.println("프로그램 종료 완료");
    }
}
