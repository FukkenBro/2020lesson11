package com.company.draw;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private final DisplayDriver displayDriver;

    private List<Shape> shapes = new ArrayList<>();

    public Screen(DisplayDriver displayDriver) {
        this.displayDriver = displayDriver;
        for (int i = 0; i < 3; i++) {
            CircleShape tmp = new CircleShape(displayDriver);
            shapes.add(tmp);
        }
//        shapes.add(new CircleShape(displayDriver, 10, 10));
//        shapes.add(new CircleShape(displayDriver, 50, 100));
//        shapes.add(new CircleShape(displayDriver, 100, 300));
    }

    public void drawFrame() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void move() {
        for (Shape shape : shapes) {
            shape.move();
        }
    }

}
