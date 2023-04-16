package com.sleepypoem.platformer.main;

import com.sleepypoem.platformer.inputs.KeyboardInputs;
import com.sleepypoem.platformer.inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private KeyboardInputs keyboardInputs;

    private MouseInputs mouseInputs;

    private int x = 0;

    private int y = 0;

    private int height = 100;

    private int width = 100;

    private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA};

    public GamePanel() {
        keyboardInputs = new KeyboardInputs(this);
        mouseInputs = new MouseInputs(this);
        this.addKeyListener(keyboardInputs); // Add keyboard inputs
        this.addMouseListener(mouseInputs); // Add mouse inputs
        this.addMouseMotionListener(mouseInputs); // Add mouse motion inputs
    }

    public void changeSize(int size) {
        this.height += size;
        this.width += size;
        repaint();
    }

    public void changeX(int x) {
        this.x += x;
        repaint();
    }

    public void changeY(int y) {
        this.y += y;
        repaint();
    }

    public void changeColor() {
        Graphics g = this.getGraphics();
        g.setColor(colors[(int) (Math.random() * colors.length)]);
        repaint();
    }

    public void setRectPosition(int x, int y) {
        this.x = x;
        this.y = y;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(colors[(int) (Math.random() * colors.length)]);
        g.fillRect(x, y, 0 + width, 0 + height);
    }
}
