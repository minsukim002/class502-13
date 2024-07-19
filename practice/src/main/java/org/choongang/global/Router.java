package org.choongang.global;

import org.choongang.global.constants.MainMenu;

import java.awt.*;

public interface Router {
    void change(MainMenu menu);

    void start();
}
