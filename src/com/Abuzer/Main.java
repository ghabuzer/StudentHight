package com.Abuzer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int numStudents;
	    double [] height;
        System.out.println("how mnay students are in the class ?");
        numStudents = in.nextInt();
        height = new double[numStudents];
        for(int i = 0; i < numStudents;i++)
        {
            System.out.println("enter the heights");
            height[i] = in .nextDouble();
        }

        double maxHeight = height [0];
        for(int i = 1; i < height.length; i++)
        {
            if(maxHeight<height[i])
            {
                maxHeight = height[i];
            }
        }
        double total = 0;
        for(int i =0; i < height.length;i++)
        {
            total += height[i];
        }
        System.out.println("The tallest student in the class is : " + maxHeight);
        System.out.printf("The average height of all the student is %5.2f: " ,total/numStudents);
    }
}
