package org.choongang.template.main;

import org.choongang.template.Template;

public class MainTpl implements Template {
    @Override
    public String getTpl() {
        StringBuffer sb = new StringBuffer(2000);
        sb.append("메인 메뉴\n");
        sb.append("0. 로그아웃");
        sb.append("1. 학생 정보 조회(자기 정보)");
        sb.append("2. 강의 정보 조회");

        return sb.toString();
    }
}
