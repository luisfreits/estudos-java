package model;

public class Rectangle {
    public double 
    w, h;

    public double area(){
        double area = w * h;
        return area;
    }

    public double perimeter(){
        double perimeter = (w * 2) + (h * 2);
        return perimeter;
    }

    public double diagonal(){
        double diagonal =  Math.sqrt((w*w)+(h*h));
        return diagonal;
    }
}