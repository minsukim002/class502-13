package exam01.member.services;

import exam01.member.controllers.RequestJoin;
import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import exam01.member.validators.JoinValidator;

import java.time.LocalDateTime;


public class JoinService {
    private JoinValidator validator;
    private MemberDao memberDao;

    // 의존 관계 - 없으면 객체 생성 X
    public JoinService(JoinValidator validator, MemberDao memberDao){
        this.validator = validator;
        this.memberDao = memberDao;
    }


        // 연관 관걔 - 없어도 객체는 생성된다.
//    public void setValidator(JoinValidator validator) {
//        this.validator = validator;
//    }

    public void process(RequestJoin form){
        validator.check(form);  // joinService 는 validator 객체, from 객체를 의존 -> 의존성

            //데이터 영구 저장 - DAO(Data Access Object)

        Member member = Member.builder()
                .email(form.getEmail())
                .password(form.getPassword())
                .userName(form.getUserName())
                .regDt(LocalDateTime.now())
                .build();

        memberDao.register(member);
    }
}
