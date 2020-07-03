package com.example.rectcalc;

import java.util.Vector;

public class RectCalc {

    public static void main(String[] args) {

        double width, height;

        double width1 = 20;
        double height1 = 30;

        double width2 = 40;
        double height2 = 50;
        double result;

        Vector<Double> rectangeResults = new Vector();
        Vector<double[]> squareResults = new Vector();
        
        //I cant see the image so i asumed it might show me some values for calling the method so i just choose some myself

        //point3
        System.out.println("Point 3: ");

        result = calculateRectArea(10, 20);
        rectangeResults.addElement(result);

        result = calculateRectArea(width1, height1);
        rectangeResults.addElement(result);
        result = calculateRectArea(width2, height2);
        rectangeResults.addElement(result);

        // point4
        System.out.println("Point 4: ");

        double[] resultAreaPerimeter = calcSquareAreaPerimeter(4);
        squareResults.addElement(resultAreaPerimeter);
        resultAreaPerimeter = calcSquareAreaPerimeter(2);
        squareResults.addElement(resultAreaPerimeter);


        //point5

        System.out.println("Point 5: ");

        result = calculateRectArea(60, 10);
        rectangeResults.addElement(result);
        result = calculateRectArea(100, 20);
        rectangeResults.addElement(result);
        result = calculateRectArea(50, 7);
        rectangeResults.addElement(result);

        resultAreaPerimeter = calcSquareAreaPerimeter(60);
        squareResults.addElement(resultAreaPerimeter);

        resultAreaPerimeter = calcSquareAreaPerimeter(100);
        squareResults.addElement(resultAreaPerimeter);

        resultAreaPerimeter = calcSquareAreaPerimeter(50);
        squareResults.addElement(resultAreaPerimeter);

        //Bonus 1

        System.out.println("Bonus 1: ");

        double[][] testData = {
                {45, 20},
                {60, 40},
                {70, 35},
                {200, 100},
                {500, 20},
        };

        for (double[] dataSet : testData) {
            result = calculateRectArea(dataSet[0], dataSet[1]);
            System.out.println(result);
            rectangeResults.addElement(result);
        }

        //Bonus2

        System.out.println("Bonus 2");
        if(args.length >= 2) {
            width = Double.parseDouble(args[0]);
            height = Double.parseDouble(args[1]);
            result = calculateRectArea(width, height);
            System.out.println(result);
        }

    }


    public static double calculateRectArea(double width, double height) {

        double area = width * height;
        System.out.println("The area is: " + area);
        return area;

    }

    public static double[] calcSquareAreaPerimeter(double width) {
        double area = width * width;
        double perimeter = width * 4;
        System.out.println("The area is: " + area + " and the perimeter is: " + perimeter);

        return new double[]{area, perimeter};
    }
}
