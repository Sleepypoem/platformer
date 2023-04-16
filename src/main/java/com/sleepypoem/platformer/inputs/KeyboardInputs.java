package com.sleepypoem.platformer.inputs;

import com.sleepypoem.platformer.main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.changeY(-10);
                break;
            case KeyEvent.VK_A:
                gamePanel.changeX(-10);
                break;
            case KeyEvent.VK_S:
                gamePanel.changeY(10);
                break;
            case KeyEvent.VK_D:
                gamePanel.changeX(10);
                break;
            case KeyEvent.VK_UP:
                gamePanel.changeSize(10);
                break;
            case KeyEvent.VK_DOWN:
                gamePanel.changeSize(-10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
