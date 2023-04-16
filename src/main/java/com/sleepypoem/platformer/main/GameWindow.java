package com.sleepypoem.platformer.main;

import javax.swing.*;
import java.awt.*;

public class GameWindow {

    public GameWindow(GamePanel gamePanel) {
        JFrame frame = new JFrame("Platformer");
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.add(gamePanel);
        frame.setVisible(true);
    }
}
