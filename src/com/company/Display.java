package com.company;

import com.company.draw.DisplayDriver;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Display implements DisplayDriver {

    private final GraphicsContext gc;

    public Display(GraphicsContext gc) {
        this.gc = gc;
    }

    @Override
    public void setColor(int r,int g, int b) {
        gc.setFill(Color.rgb(r,g,b));
    }

    @Override
    public void drawCircle(double x, double y, double diameter) {
        gc.fillOval(x, y, diameter, diameter);
    }

    @Override
    public double getWidth() {
        return gc.getCanvas().getWidth();
    }

    @Override
    public double getHeight() {
        return gc.getCanvas().getHeight();
    }

}
