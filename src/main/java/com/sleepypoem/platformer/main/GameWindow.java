package com.sleepypoem.platformer.main;

import javax.swing.*;

public class GameWindow {

    public GameWindow(GamePanel gamePanel) {
        JFrame frame = new JFrame("Platformer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
