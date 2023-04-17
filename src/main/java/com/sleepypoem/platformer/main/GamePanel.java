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

    long lastcheck = 0;
    private int rectHeight = 100;
    private int rectWidth = 100;
    private int frames = 0;
    private int speed = 1;

    private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA};

    public GamePanel() {
        keyboardInputs = new KeyboardInputs(this);
        mouseInputs = new MouseInputs(this);
        this.addKeyListener(keyboardInputs); // Add keyboard inputs
        this.addMouseListener(mouseInputs); // Add mouse inputs
        this.addMouseMotionListener(mouseInputs); // Add mouse motion inputs
    }

    public void changeSize(int size) {
        this.rectHeight += size;
        this.rectWidth += size;
    }

    public void changeX(int x) {
        this.x += x;
    }

    public void changeY(int y) {
        this.y += y;
    }

    public void changeColor() {
        Graphics g = this.getGraphics();
        g.setColor(colors[(int) (Math.random() * colors.length)]);
    }

    public void setRectPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        this.x += speed;
        if (this.x >= 800 || this.x <= 0) {
            speed *= -1;
        }

        this.y += speed;
        if (this.y >= 600 || this.y <= 0) {
            speed *= -1;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(x, y, rectWidth, rectHeight);
        update();
    }
}
