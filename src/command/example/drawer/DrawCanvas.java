package command.example.drawer;

import command.example.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color=Color.red;

    private int radius=6;

    private MacroCommand history;

    public DrawCanvas(int width,int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void paint() {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x-radius, y-radius, radius*2, radius*2);
    }
}
