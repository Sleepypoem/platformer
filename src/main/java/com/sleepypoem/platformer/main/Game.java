package com.sleepypoem.platformer.main;

public class Game implements Runnable {

    private GameWindow window;

    private GamePanel panel;

    private static final int FPS = 60;
    private Thread thread;

    public Game() {
        panel = new GamePanel();
        window = new GameWindow(panel);
        panel.requestFocus();
        start();
    }

    private void start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        double timePerTick = 1000000000.0 / FPS;
        long lastTime = System.nanoTime();
        long now;
        int frames = 0;
        long lastCheck = System.currentTimeMillis();

        while (true) {
            now = System.nanoTime();
            if (now - lastTime >= timePerTick) {
                panel.repaint();
                lastTime = now;
                frames++;
            }

            if (System.currentTimeMillis() - lastCheck >= 1000) {
                System.out.println("FPS: " + frames);
                frames = 0;
                lastCheck = System.currentTimeMillis();
            }
        }

    }
}
