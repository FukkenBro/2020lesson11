package com.company.draw;

import com.company.draw.DisplayDriver;
import com.company.draw.Shape;
import com.company.motion.CircleBounce;

import java.util.Random;

public class CircleShape implements Shape {

    private static final Random RANDOM = new Random();
    public DisplayDriver displayDriver;
    public int red;
    public int green;
    public int blue;
    public double x;
    public double y;
    public double diameter;
    public double xSpeed;
    public double ySpeed;

    public CircleShape(DisplayDriver displayDriver, int x, int y) {
        this.displayDriver = displayDriver;
        this.x = x;
        this.y = y;
        xSpeed = RANDOM.nextInt(5) + 2;
        ySpeed = RANDOM.nextInt(2) + 3;
    }

    public CircleShape(DisplayDriver displayDriver) {
        this.displayDriver = displayDriver;
        x = RANDOM.nextInt((int) displayDriver.getWidth());
        y = RANDOM.nextInt((int) displayDriver.getHeight());
        xSpeed = RANDOM.nextInt(5) + 1;
        ySpeed = RANDOM.nextInt(2) + 1;
        red = RANDOM.nextInt(255);
        green = RANDOM.nextInt(255);
        blue = RANDOM.nextInt(255);
        diameter = RANDOM.nextInt(100)+50;
    }

    @Override
    public void draw() {
        displayDriver.setColor(red,green,blue);
        displayDriver.drawCircle(x, y, diameter);
    }

    @Override
    public void move() {
        CircleBounce.move(this);
    }
}
