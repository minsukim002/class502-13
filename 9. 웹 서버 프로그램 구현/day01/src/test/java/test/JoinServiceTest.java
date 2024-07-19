package test;

import global.exceptions.ValidationException;
import member.controllers.RequestJoin;
import member.services.JoinService;
import member.validators.JoinValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능 테스트")
public class JoinServiceTest {

    private JoinService joinService;

    @BeforeEach
    void init() {
        joinService = new JoinService(new JoinValidator());
    }

    RequestJoin getData() {
        return RequestJoin.builder()
                .email("test" + System.currentTimeMillis() + "@test.org")
                .password("12345678")
                .confirmPassword("12345678")
                .userName("사용자")
                .termsAgree(true)
                .build();
    }

    @Test
    @DisplayName("회원가입 성공시 예외가 발생 없음")
    void successTest() {
        assertDoesNotThrow(() -> {
            joinService.process(getData());
        });
    }

    @Test
    @DisplayName("필수항목(이메일, 비밀번호, 비밀번호 확인, 회원명) 검증, 검증 실패시 ValidationException 발생")
    void requiredFieldTest() {
        assertAll(
                () -> {
                    RequestJoin form = getData();
                    form.setEmail(null);
                    requiredFieldEachTest(form,"이메일");


                    form.setEmail("      ");
                    requiredFieldEachTest(form, "이메일");
                },

                () -> {
                    RequestJoin form = getData();
                    form.setPassword(null);
                    requiredFieldEachTest(form, "비밀번호");

                    form.setPassword("      ");
                    requiredFieldEachTest(form, "비밀번호");

                },

                () -> {
                    RequestJoin form = getData();
                    form.setConfirmPassword(null);
                    requiredFieldEachTest(form, "비밀번호를 확인");

                    form.setConfirmPassword("    ");
                    requiredFieldEachTest(form, "비밀번호를 확인");
                }
        );

    }

    void requiredFieldEachTest(RequestJoin form, String keyword) {
        ValidationException thrown = assertThrows(ValidationException.class, () -> {
            joinService.process(form);
        });

        String message = thrown.getMessage();
        assertTrue(message.contains(keyword));
    }
    @Test
    @DisplayName("비밀번호와 비밀번호 확인 일치 테스트, 검증 실패시 ValidationException 발생 ")
    void passwordMathTest(){

    }
    @Test
    @DisplayName("이메일 중복 여부 테스트, 검증 실패시 DuplicateMemberException 발생. ")
    void duplicateEmailTest(){

    }
    @Test
    @DisplayName("회원 가입 완료 후 실제 데이터베이스에서 조회 되는지 검증")
    void memberExistsTest(){
        //가입처리

        // getData()로 생성한 데이터의 email 항목으로 DB조회

        // 조회한 회원 데이터 email 과 getData()로 생성한 email 이 일치하는지 체크
        // assertEquals(...)


    }
}