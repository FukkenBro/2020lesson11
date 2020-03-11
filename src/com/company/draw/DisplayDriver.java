package com.company.draw;

public interface DisplayDriver {
    void setColor(int r, int g, int b);
    void drawCircle(double x, double y, double diameter);
    double getWidth();
    double getHeight();
}
