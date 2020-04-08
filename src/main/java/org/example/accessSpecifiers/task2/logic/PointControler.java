package org.example.accessSpecifiers.task2.logic;

public class PointControler {

    public void addX(Point point) {
        point.setX(point.getX() + 1);
    }

    public void addY(Point point) {
        point.setY(point.getY() + 1);
    }

    public void subtractX (Point point) {
        point.setX(point.getX() - 1);
    }

    public void subtractY(Point point) {
        point.setY(point.getY() - 1);
    }
}