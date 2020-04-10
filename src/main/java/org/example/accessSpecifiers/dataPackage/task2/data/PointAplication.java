package org.example.accessSpecifiers.dataPackage.task2.data;

import org.example.accessSpecifiers.dataPackage.task2.logic.Point;
import org.example.accessSpecifiers.dataPackage.task2.logic.PointControler;

public class PointAplication {
    public static void main(String[] args) {
        int x;
        int y;
        Point point = new Point(10, 100);
        System.out.println("punkt ( " + point.getX() + " : "  + point.getY() + " )");
        PointControler pointControler = new PointControler();
        pointControler.addX(point);

        System.out.println(" x :" + point.getX() + " y :" + point.getY());
        pointControler.subtractY(point);

        System.out.println(" x :" + point.getX() + " y :" + point.getY());

    }
}
