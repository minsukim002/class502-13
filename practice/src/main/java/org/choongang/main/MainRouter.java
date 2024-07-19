package org.choongang.main;

import org.choongang.global.Controller;
import org.choongang.global.Menu;
import org.choongang.global.Router;
import org.choongang.global.constants.MainMenu;
import org.choongang.main.controllers.MainController;
import org.choongang.member.controllers.LoginController;

public class MainRouter implements Router {
    private static Router instance;
    private MainRouter(){}
    public static Router getInstance(){
        if(instance == null){
            instance = new MainRouter();
        }
    return instance;
    }



    @Override
    public void change(MainMenu menu) {
        Controller controller = null;
        switch (menu) {
            case JOIN:
                controller = new LoginController(); break;
            case LOGIN:
                controller = new LoginController(); break;
            default:
                controller = new MainController();

        }


    }



    @Override
    public void start() {
        while (true){
            change(MainMenu.MAIN);
        }

    }

}
