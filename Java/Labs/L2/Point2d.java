package com.company;

public class Point2d {
    /** координата X **/
    private double xCord;
    /**  координата Y **/
    private double yCord;
    /** Конструктор **/
    public Point2d ( double x,  double y) {
        xCord = x;
        yCord = y;
    }
    /** Конструктор по умолчанию. **/
    public Point2d () {
        //Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }
    /** Возврат координаты X **/
    public double getX () {
        return xCord;
    }
    /** Возврат координаты Y **/
    public double getY () {
        return yCord;
    }
    /** Присвоение значения координаты X. **/
    public void setX ( double val) {
        xCord = val;
    }
    /**  Присвоение значения координаты Y. **/
    public void  setY ( double val) {
        yCord = val;
    }
}

