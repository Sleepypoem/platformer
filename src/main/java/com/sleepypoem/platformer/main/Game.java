package com.sleepypoem.platformer.main;

import javax.swing.*;

public class Game {

    private GameWindow window;

    private GamePanel panel;

    public Game() {
        panel = new GamePanel();
        window = new GameWindow(panel);
    }
}
