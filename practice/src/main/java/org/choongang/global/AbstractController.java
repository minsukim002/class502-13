package org.choongang.global;

import org.choongang.global.constants.MainMenu;
import org.choongang.main.MainRouter;

import java.util.Scanner;

public abstract class AbstractController implements Controller {

    protected Scanner sc;

    public AbstractController() {
        sc = new Scanner(System.in);

    }

    public void common() {
        System.out.println("학생관리 프로그램 Ver1.0");

    }

    public void prompt(){
        System.out.print("메뉴 선택: ");
        String menu = sc.nextLine();
    }

    public final void run() {
        common();
        show();
        prompt();
    }

    private void change(int menuNo){
        MainMenu menu = null;
        switch(menuNo){
            case 1: menu = MainMenu.JOIN; break; // 회원가입

            case 2: menu = MainMenu.LOGIN; break; // 로그인

            default: menu = MainMenu.MAIN; // 메인메뉴

        }

    }


}