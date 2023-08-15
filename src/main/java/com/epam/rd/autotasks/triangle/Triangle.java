package com.epam.rd.autotasks.triangle;

class Triangle {

    Point a, b, c;


    public Triangle(Point a, Point b, Point c) {
        //TODO

        double area = 0.5 * ((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY()));
        if (Math.abs(area) < 1e-6) {
            throw new IllegalArgumentException("Degenerate triangle!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        //TODO

        double area = 0.5 * Math.abs((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY()));
        return area;
    }

    public Point centroid(){
        //TODO
        double centerX = (a.getX() + b.getX() + c.getX()) / 3;
        double centerY = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(centerX, centerY);
    }

}
