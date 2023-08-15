package com.company;

import java.awt.*;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        double[] coords = new double[3];

        //объявление первой точки
        System.out.println ("Введите координаты первой точки:");
        for (int i=0; i<3; i++) {
            coords[i]=scanner.nextDouble();
        }
        Point3d one = new Point3d(coords[0], coords[1], coords[2]);

        //объясление второй точки
        System.out.println ("Введите координаты второй точки:");
        for (int i=0; i<3; i++) {
            coords[i]=scanner.nextDouble();
        }
        Point3d two = new Point3d(coords[0], coords[1], coords[2]);

        //объявление третьей точки
        System.out.println ("Введите координаты третьей точки");
        for (int i=0; i<3; i++) {
            coords[i]=scanner.nextDouble();
        }
        Point3d three = new Point3d(coords[0], coords[1], coords[2]);

        scanner.close();


        //Вывод координат
        System.out.printf("Координаты первой точки: %.2f %.2f %.2f \n Координаты второй точки: %.2f %.2f %.2f \n Координаты третьей точки: %.2f %.2f %.2f \n", one.getX(), one.getY(), one.getZ(), two.getX(), two.getY(), two.getZ(), three.getX(), three.getY(), three.getZ());
        //Вывод дистанций
        System.out.printf ("1 сторона: %.2f \n2 сторона: %.2f\n3 сторона: %.2f\n",one.distanceTo(two), two.distanceTo(three), three.distanceTo(one));
        //Вывод площади
        System.out.printf ("Найденная площадь: %.2f", computeArea(one, two, three));

    }

    public static double computeArea(Point3d one, Point3d two, Point3d three){
        double s;
        //Сравнение есть ли одинаковые точки
        if (one.isEquals(two) || two.isEquals(three) || three.isEquals(one)) {
            System.out.println("Есть совпадение точек. Это не треугольник");
            s=0;
        }
        //подсчет площади
        else {
            double[] sides = {one.distanceTo(two), two.distanceTo(three), three.distanceTo(one)};
            double p = (sides[0]+sides[1]+sides[2])/2;
            s = Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
        }
        return s;

    }
}
