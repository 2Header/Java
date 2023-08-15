package com.company;

public class Point3d extends Point2d { //extends - ключевое слово для наследования
    private double zCord; //координата z

    //конструктор инициализации
    public Point3d(double x, double y, double z) {
        super (x,y);
        zCord = z;
    }

    //Конструктор по умолчанию
    public Point3d() {
        this (0.0, 0.0, 0.0);
    }

    //Возвращение z
    public double getZ(){
        return zCord;
    }

    //Установка значения z
    public void setZ (double val) {
        zCord = val;
    }

    //сравнение двух объектов
    public boolean isEquals (Point3d obj) {
        return this.getX() == obj.getX() && this.getY() == obj.getY() && this.zCord == obj.zCord;
    }

    //метод для вычисления расстояния
    public double distanceTo (Point3d obj){
        //вычисление расстояния
        double l = Math.sqrt(Math.pow((this.getX() - obj.getX()), 2) + Math.pow((this.getY() - obj.getY()), 2) + Math.pow((this.getZ() - obj.getZ()), 2));
        return l;
    }
}
